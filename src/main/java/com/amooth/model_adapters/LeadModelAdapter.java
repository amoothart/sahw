package com.amooth.model_adapters;

import com.amooth.models.InternalLead;
import com.amooth.models.Lead;

public class LeadModelAdapter implements KinveyModelAdapter<Lead, InternalLead> {
    @Override
    public Lead kinveyFromInternal(InternalLead entity) {
        return new Lead(entity.getId(),
                entity.getStreet(),
                entity.getCity(),
                entity.getCompany(),
                entity.getCreatedDate());
    }

    @Override
    public InternalLead internalFromKinvey(Lead entity) {
        return null;
    }
}
