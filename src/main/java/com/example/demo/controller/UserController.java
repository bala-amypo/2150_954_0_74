package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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

    @GetMapping("/getall")
    public List<UserEntity> all(){
        return ser.getall();
    }
}
