package com.example.demo.entity;

public class Studententity{
    private int id;
    private String name;
    private String email;

    constructor(int id,String name,String email){
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public int getId(){
        return id;
    }
    public void setId(){
        this.id=id;
    }
    public String getName(){
        return name;
    }
    public void setName(){
        this.name=name;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(){
        this.email=email;
    }

}