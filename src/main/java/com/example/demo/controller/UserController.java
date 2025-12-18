package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entity.UserEntity;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

public class UserController {
    @Autowired
    UserService ser;

    @PostMapping("/add")
    public UserEntity post(@RequestBody UserEntity st){
        return ser.add(st);
    }
}
