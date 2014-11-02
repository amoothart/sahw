package com.amooth;

import com.amooth.configuration.Collection;
import com.amooth.data_access.SalesforceAuth;
import com.amooth.filters.KinveyApiFilter;
import com.codahale.metrics.health.HealthCheck;
import com.google.common.base.Optional;
import com.sforce.soap.enterprise.Soap;
import io.dropwizard.Application;
import io.dropwizard.client.HttpClientBuilder;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import org.apache.http.client.HttpClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.Filter;
import java.io.IOException;
import java.lang.reflect.Constructor;

public class App extends Application<AppConfiguration> {

    private static final ClassLoader classLoader = ClassLoader.getSystemClassLoader();

    public static void main(String args[]) throws Exception {
        new App().run(args);
    }

    private final Logger logger = LoggerFactory.getLogger(App.class);

    @Override
    public void initialize(Bootstrap<AppConfiguration> appConfigurationBootstrap) {
    }

    @Override
    public void run(AppConfiguration appConfiguration, Environment environment) throws Exception {
        final HttpClient httpClient = new HttpClientBuilder(environment).using(appConfiguration.getHttpClientConfiguration())
                .build(environment.getName());

        Filter filter = new KinveyApiFilter(appConfiguration.getApiKey(), appConfiguration.getUsingApiKey());
        environment.servlets().addFilter("/*", filter);

        Soap port = SalesforceAuth.getPort();

        for(Collection collection : appConfiguration.getCollections()) {
            registerResource(environment, collection, appConfiguration, httpClient, port);
            registerHealthCheck(environment, collection, appConfiguration, httpClient, port);
        }
    }

    private void registerResource(Environment environment, Collection collection, AppConfiguration appConfiguration, HttpClient httpClient, Soap port) {
        logger.info("Loading resource " + collection.getName());

        Optional<Object> resource = loadResource(collection, appConfiguration, httpClient, port);

        if(resource.isPresent()) {
            logger.info("Resource was loaded successfully, registering.");
            environment.jersey().register(resource.get());
            logger.info("Resource was registered.");
        } else {
            logger.warn("Failed to register resource " + collection.getName() + ", it will not be available this run.");
        }
    }

    private void registerHealthCheck(Environment environment, Collection collection, AppConfiguration appConfiguration, HttpClient httpClient, Soap port) {
        logger.info("Loading HealthCheck for resource " + collection.getName());

        Optional<HealthCheck> healthCheck = loadHealthCheck(collection, appConfiguration, httpClient, port);

        if(healthCheck.isPresent()) {
            logger.info("HealthCheck was loaded successfully, registering");
            environment.healthChecks().register(collection.getName(), healthCheck.get());
            logger.info("HealthCheck for resource was registered.");
        } else {
            logger.warn("Failed to register HealthCheck for resource " + collection.getName() + ", no health information will be available.");
        }
    }

    private Optional<Object> loadResource(Collection collection, AppConfiguration appConfiguration, HttpClient httpClient, Soap port) {
        String className = getClassName(collection.getName(), "resources", "Resource");

        try {
            Object o;

            if(collection.isUsingGlobalHttpClient()) {
                o = loadObject(className, appConfiguration, httpClient, port);
            } else {
                o = loadObject(className, appConfiguration, port);
            }

            return Optional.of(o);
        } catch (IOException e) {
            logger.error("Failed to load Resource(" + className + ")", e);
            return Optional.absent();
        }
    }

    private Optional<HealthCheck> loadHealthCheck(Collection collection, AppConfiguration appConfiguration, HttpClient httpClient, Soap port) {
        String className = getClassName(collection.getName(), "health", "HealthCheck");

        try {
            Object o;

            if (collection.isUsingGlobalHttpClient()) {
                o = loadObject(className, appConfiguration, httpClient, port);
            } else {
                o = loadObject(className, appConfiguration, port);
            }

            assert(o instanceof HealthCheck);  // TODO: Can we catch this early somehow?

            return Optional.of((HealthCheck)o);
        } catch (IOException e){
            logger.error("Failed to load HealthCheck(" + className + ")", e);
            return Optional.absent();
        }
    }

    private String getClassName(String collectionName, String parentPackage, String suffix) {
        String packageName = getResourcePackage(parentPackage);
        String className = packageName + ".";
        className += collectionName.substring(0, 1).toUpperCase() + collectionName.substring(1);
        if(suffix != null) {
            className += suffix;
        }

        return className;
    }

    private String getResourcePackage(String parentPackage) {
        return this.getClass().getPackage().getName() + "." + parentPackage;
    }

    private Object loadObject(String className, AppConfiguration appConfiguration, Soap port) throws IOException {
        try {
            Constructor<?> constructor = findConstructor(loadClass(className), false);
            return constructor.newInstance(appConfiguration, port);
        } catch (IOException e) {
            throw e;
        } catch (Exception e) {
            throw new IOException(e);
        }
    }

    private Object loadObject(String className, AppConfiguration appConfiguration, HttpClient httpClient, Soap port) throws IOException {
        try {
            Constructor<?> constructor = findConstructor(loadClass(className), true);
            return constructor.newInstance(appConfiguration, httpClient, port);
        } catch (IOException e) {
            throw e;
        } catch (Exception e) {
            throw new IOException(e);
        }
    }

    private Class loadClass(String name) throws IOException {
        try {
            return classLoader.loadClass(name);
        } catch (ClassNotFoundException e) {
            throw new IOException(e);
        }
    }

    private Constructor<?> findConstructor(Class clazz, boolean needsHttpClass) throws IOException {
        Constructor<?> constructor;

        try {
            if(needsHttpClass) {
                constructor = clazz.getConstructor(AppConfiguration.class, HttpClient.class, Soap.class);
            } else {
                constructor = clazz.getConstructor(AppConfiguration.class, Soap.class);
            }

            return constructor;
        } catch (NoSuchMethodException e) {
            throw new IOException(e);
        }
    }
}
