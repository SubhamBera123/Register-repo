package com.example.registration.service;

import java.util.List;

import com.example.registration.entity.User;

public interface UserService {
    
    User saveUser(User user);
    List<User> getAllUsers();
}