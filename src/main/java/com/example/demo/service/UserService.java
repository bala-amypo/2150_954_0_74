package com.example.demo.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.example.demo.entity.UserEntity;

@Service
public class UserService {

    Map<Long, UserEntity> store = new HashMap<>();

    public UserEntity add(UserEntity st) {
        store.put(st.getId(), st);
        return st;
    }

    public List<UserEntity> getall() {
        return new ArrayList<>(store.values());
    }
}
