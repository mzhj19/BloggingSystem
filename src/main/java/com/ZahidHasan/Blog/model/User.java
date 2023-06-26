package com.ZahidHasan.Blog.model;


import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
public class User extends Audit{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long id;
    private String email;
    private String name;
    private String password;

    public User()   {

    }

    public User(Timestamp createdAt, Timestamp updatedAt, long id, String email, String name, String password) {
        super(createdAt, updatedAt);
        this.id = id;
        this.email = email;
        this.name = name;
        this.password = password;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
