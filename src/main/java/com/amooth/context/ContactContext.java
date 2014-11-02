package com.amooth.context;

public class ContactContext {
    public static ContactContext createContext(String query){
        return new ContactContext(query);
    }

    private String query;

    public ContactContext(){
        query = "";
    }

    public ContactContext(String query){
        this.query = query;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }
}
