package com.amooth.models;

public class InternalContact {
    private final String id;
    private final String accountId;
    private final String description;
    private final String firstName;
    private final String lastName;

    public InternalContact(String id, String accountId, String description, String firstName, String lastName) {
        this.id = id;
        this.accountId = accountId;
        this.description = description;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "InternalContact{" +
                "id='" + id + '\'' +
                ", accountId='" + accountId + '\'' +
                ", description='" + description + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
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
