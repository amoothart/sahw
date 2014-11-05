package com.amooth.data_access;

import com.sforce.soap.enterprise.Login;
import com.sforce.soap.enterprise.LoginResponse;
import com.sforce.soap.enterprise.SessionHeader;
import com.sforce.soap.enterprise.Soap;
import com.sun.xml.ws.api.message.Headers;
import com.sun.xml.ws.developer.WSBindingProvider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Service;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.handler.MessageContext;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SalesforceAuth {
    private static final Logger logger = LoggerFactory.getLogger(SalesforceAuth.class);

    public static Soap getPort() {
        Soap port;
        //TODO: What is the wsdl endpoint?
        try {
            port = Service.create(new URL("http://localhost/wsdl/kinvey-wsdl.xml"),
                    new QName("urn:enterprise.soap.sforce.com", "SforceService")).getPort(Soap.class);
        } catch (MalformedURLException e) {
            logger.error("Unable to create soap service", e);
            throw new WebServiceException(e);
        }

        logger.info("Logging into Salesforce");

        Login login = new Login();
        login.setUsername("amooth@gmail.com");
        //TODO: don't use personal pw
        login.setPassword("LEn4Q2k&^4o8Mn8@qrG0SiwTnt9X1ukvPeheGXRfbMQ3");
        LoginResponse loginResponse;
        try {
            loginResponse = port.login(login);
        } catch (Exception e) {
            logger.error("Failed to log into salesforce", e);
            throw new WebServiceException(e);
        }

        System.out.println("Login was successfull.");
        System.out.print("The returned session id is: ");
        System.out.println(loginResponse.getResult().getSessionId());
        System.out.print("Your logged in user id is: ");
        System.out.println(loginResponse.getResult().getUserId() + " \n\n");

        WSBindingProvider bindingProvider = ((WSBindingProvider) port);
        bindingProvider.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, loginResponse.getResult().getServerUrl());

        //Enable GZip compression
        Map<String, List<String>> httpHeaders = new HashMap<String, List<String>>();
        httpHeaders.put("Content-Encoding", Collections.singletonList("gzip"));
        httpHeaders.put("Accept-Encoding", Collections.singletonList("gzip"));
        Map<String, Object> reqContext = bindingProvider.getRequestContext();
        reqContext.put(MessageContext.HTTP_REQUEST_HEADERS, httpHeaders);

        SessionHeader sh = new SessionHeader();
        sh.setSessionId(loginResponse.getResult().getSessionId());
        try {
            JAXBContext jc = JAXBContext.newInstance("com.sforce.soap.enterprise");
            bindingProvider.setOutboundHeaders(Headers.create(jc, sh));
        } catch (JAXBException e) {
            logger.error("Error creating JAXBContext instance ", e);
            throw new WebServiceException(e);
        }

        return port;
    }
}
