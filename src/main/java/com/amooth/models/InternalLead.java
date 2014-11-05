package com.amooth.models;

import javax.xml.datatype.XMLGregorianCalendar;

public class InternalLead {
    private final String id;
    private final String street;
    private final String city;
    private final String company;
    private final XMLGregorianCalendar createdDate;

    public InternalLead(String id, String street, String city, String company, XMLGregorianCalendar createdDate) {
        this.id = id;
        this.street = street;
        this.city = city;
        this.company = company;
        this.createdDate = createdDate;
    }

    @Override
    public String toString() {
        return "InternalLead{" +
                "id='" + id + '\'' +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", company='" + company + '\'' +
                ", createdDate=" + createdDate +
                '}';
    }

    public String getId() {
        return id;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getCompany() {
        return company;
    }

    public XMLGregorianCalendar getCreatedDate() {
        return createdDate;
    }
}
