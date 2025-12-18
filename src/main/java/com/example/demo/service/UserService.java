package com.example.demo.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.example.demo.entity.UserEntity;

@Service
public class UserService {

   Map<Integer , UserEntity > store = new HashMap<>();

   public UserEntity add(UserEntity st){
    store.put(st.getId(), st);
   }
   
   publi List<UserEntity> getall(){

    return new ArrayList<>(st.values())

   }
}
