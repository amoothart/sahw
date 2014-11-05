package com.amooth.context;

public class LeadContext {

    public static LeadContext createContext(String authToken) {
        return new LeadContext(authToken);
    }

    private String query;

    public LeadContext() {
        query = "";
    }

    public LeadContext(String query) {
        query = "";
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }
}