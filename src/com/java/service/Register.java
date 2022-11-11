package com.java.service;

public class Register {
    private String nickName;
    private String password;
    private String email;
    private String phoneNumber;

    // setter and getter
    public void setNickName(String name) {
        this.nickName = name;
    }

    public String getNickName() {
        return this.nickName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return this.password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return this.email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    
}
