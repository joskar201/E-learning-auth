package com.indevsdigital.joshua.elerningauthorisation;

/**
 * Created by joshua on 16/12/17.
 * A pojo representing the response JSON object
 */

public class Token {
    String token;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Token(String token) {
        this.token = token;
    }
}
