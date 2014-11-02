package com.amooth.context;

public class LoginHistoryContext {

    public static LoginHistoryContext createContext(String authToken) {
        return new LoginHistoryContext(authToken);
    }

    private String query;

    public LoginHistoryContext() {
        query = "";
    }

    public LoginHistoryContext(String query) {
        query = "";
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }
}