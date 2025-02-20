package com.example.demo.Model;

public class User {

    private String id;
    private String name;
    private String email;
    private String hashPassword;

    public User(String id, String name, String email, String hashPassword){
        this.id = id;
        this.name = name;
        this.email = email;
        this.hashPassword = hashPassword;
    }

    public User(){}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHashPassword() {
        return hashPassword;
    }

    public void setHashPassword(String hashPassword) {
        this.hashPassword = hashPassword;
    }

}
