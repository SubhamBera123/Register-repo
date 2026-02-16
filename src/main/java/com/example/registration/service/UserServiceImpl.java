package com.example.registration.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.registration.entity.User;
import com.example.registration.repository.UserRepo;

@Service
public class UserServiceImpl implements UserService{
    private final UserRepo repo;

    public UserServiceImpl(UserRepo repo){
        this.repo = repo;
    }

    @Override
    public User saveUser(User user) {
        return repo.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return repo.findAll();
    }
}