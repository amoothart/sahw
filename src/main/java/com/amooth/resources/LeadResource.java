package com.amooth.resources;

import com.amooth.AppConfiguration;
import com.amooth.configuration.ResultSet;
import com.amooth.context.LeadContext;
import com.amooth.data_access.LeadDataAccess;
import com.amooth.cache.LeadCache;
import com.amooth.model_adapters.LeadModelAdapter;
import com.amooth.models.Lead;
import com.amooth.models.InternalLead;
import com.codahale.metrics.annotation.Timed;
import com.sforce.soap.enterprise.Soap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

@Path("/lead")
@Produces(MediaType.APPLICATION_JSON)
public class LeadResource {
    private final LeadModelAdapter leadAdapter = new LeadModelAdapter();
    private final LeadDataAccess dataAccess = new LeadDataAccess();
    private final Logger logger = LoggerFactory.getLogger(LeadResource.class);
    private final AppConfiguration appConfiguration;
    private final Soap port;

    public LeadResource(AppConfiguration appConfiguration, Soap port) {
        this.appConfiguration = appConfiguration;
        this.port = port;
        LeadCache.getInstance().setCacheOptions(appConfiguration.getCachingOptions());
    }

    @GET
    @Timed
    public List<Lead> getLeads() {
        LeadContext context = LeadContext.createContext("");

        ResultSet<InternalLead> rs = dataAccess.getData(context, port);

        List<Lead> leads = new ArrayList<Lead>();

        for(InternalLead internalLead : rs.getResults()) {
            leads.add(leadAdapter.kinveyFromInternal(internalLead));
        }
        return leads;
    }
}
