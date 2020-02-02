package com.library.librarymanagement.iyer.bean;

public class SignUpBean {
    private  String userName;
    private  String password;
    private  String email;
    private  int contact;

    public SignUpBean() {
    }

    public SignUpBean(String userName, String password, String email, int contact) {
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.contact = contact;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getContact() {
        return contact;
    }

    public void setContact(int contact) {
        this.contact = contact;
    }




}
