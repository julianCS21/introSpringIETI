package com.example.demo.repository.user;

public class User {

    private String id;

    private String name;

    private String UserName;

    private String password;

    public User(String id, String name, String UserName, String password) {
        this.id = id;
        this.name = name;
        this.UserName = UserName;
        this.password = password;
    }


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

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
