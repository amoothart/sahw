package com.amooth.model_adapters;

import com.amooth.models.Contact;
import com.amooth.models.InternalContact;

public class ContactModelAdapter implements KinveyModelAdapter<Contact, InternalContact> {
    @Override
    public Contact kinveyFromInternal(InternalContact entity) {
        return new Contact(entity.getId(),
                entity.getAccountId(),
                entity.getDescription(),
                entity.getFirstName(),
                entity.getLastName());
    }

    @Override
    public InternalContact internalFromKinvey(Contact entity) {
        return null;
    }
}
