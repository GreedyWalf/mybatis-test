package com.qs.entity;

import java.io.Serializable;

public class User implements Serializable{

    private String id;
    private String username;
    private String password;
    private Double account;

    public User(){

    }

    public User(String username, String password, Double account) {
        this.username = username;
        this.password = password;
        this.account = account;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public Double getAccount() {
        return account;
    }

    public void setAccount(Double account) {
        this.account = account;
    }
}
