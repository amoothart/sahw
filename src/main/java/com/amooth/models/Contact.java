package com.amooth.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Contact {
    @JsonProperty("_id")
    private final String id;
    @JsonProperty
    private final String accountId;
    @JsonProperty
    private final String description;
    @JsonProperty
    private final String firstName;
    @JsonProperty
    private final String lastName;

    public Contact(String id, String accountId, String description, String firstName, String lastName) {
        this.id = id;
        this.accountId = accountId;
        this.description = description;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getId() {
        return id;
    }

    public String getAccountId() {
        return accountId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getDescription() {
        return description;
    }

    public String getLastName() {
        return lastName;
    }
}
