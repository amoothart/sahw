package com.amooth.resources;

import com.amooth.AppConfiguration;
import com.amooth.cache.ContactCache;
import com.amooth.configuration.ResultSet;
import com.amooth.context.ContactContext;
import com.amooth.data_access.ContactDataAccess;
import com.amooth.model_adapters.ContactModelAdapter;
import com.amooth.models.Contact;
import com.amooth.models.InternalContact;
import com.codahale.metrics.annotation.Timed;
import com.sforce.soap.enterprise.Soap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

@Path("/contact")
@Produces(MediaType.APPLICATION_JSON)
public class ContactResource {
    private final ContactModelAdapter contactAdapter = new ContactModelAdapter();
    private final ContactDataAccess dataAccess = new ContactDataAccess();
    private final Logger logger = LoggerFactory.getLogger(ContactResource.class);
    private final AppConfiguration appConfiguration;
    private final Soap port;

    public ContactResource(AppConfiguration appConfiguration, Soap port) {
        this.appConfiguration = appConfiguration;
        this.port = port;
        ContactCache.getInstance().setCacheOptions(appConfiguration.getCachingOptions());
    }

    @GET
    @Timed
    @Path("{contactFirstName}")
    /**
     * Handle requests to the /contact/:contact_first_name endpoint
     *
     * @param contactFirstName set to the id passed by the client (/contact/:contact_first_name)
     * @param authToken set if the X-Kinvey-Auth header is present, and will contain a SAML assertion
     */
    public List<Contact> getContact(@PathParam("contactFirstName") String contactFirstName, @HeaderParam("X-Kinvey-Auth") String authToken) {
        ContactContext context = ContactContext.createContext(contactFirstName);

        ResultSet<InternalContact> rs = dataAccess.getData(context, port);

        List<Contact> contacts = new ArrayList<Contact>();

        for(InternalContact internalContact : rs.getResults()) {
            contacts.add(contactAdapter.kinveyFromInternal(internalContact));
        }

        return contacts;
    }
}
