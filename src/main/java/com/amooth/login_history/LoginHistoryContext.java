package com.amooth.login_history;

import com.amooth.core.AssertionParser;

public class LoginHistoryContext {

    public static LoginHistoryContext createContext(String authToken) {
        return new LoginHistoryContext(authToken);
    }

    private String query;
    private String name;
    private String token;
    private AssertionParser parser;

    public LoginHistoryContext() {
        query = "";
        name = "";
        token = "";
        parser = null;
    }

    public LoginHistoryContext(String authToken) {
        query = "";
        parser = new AssertionParser(authToken);
        this.name = parser.parseNameAttribute();
        this.token = parser.parseSignatureValue();
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public AssertionParser getParser() {
        return parser;
    }

    public void setParser(AssertionParser parser) {
        this.parser = parser;
    }
}
