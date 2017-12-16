package com.indevsdigital.joshua.elerningauthorisation;

/**
 * Created by joshua on 16/12/17.
 * A pojo to represent the expected JSON object for the post
 */

public class Credentials {
    String username;
    String password;

    public Credentials(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
