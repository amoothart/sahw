package com.amooth.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.datatype.XMLGregorianCalendar;

public class Lead {

    @JsonProperty("_id")
    private final String id;
    @JsonProperty
    private final String street;
    @JsonProperty
    private final String city;
    @JsonProperty
    private final String company;
    @JsonProperty
    private final XMLGregorianCalendar createdDate;

    public Lead(String id, String street, String city, String company, XMLGregorianCalendar createdDate) {
        this.id = id;
        this.street = street;
        this.city = city;
        this.company = company;
        this.createdDate = createdDate;
    }

    @Override
    public String toString() {
        return "Lead{" +
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
