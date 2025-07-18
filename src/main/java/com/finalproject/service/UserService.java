package com.finalproject.service;

import com.finalproject.Repo.UserRepo;
import com.finalproject.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepo userRepo;

    public List<UserEntity> getAllUsers() {
        return userRepo.findAll();
    }

    public UserEntity saveUser(UserEntity user) {
        return userRepo.save(user);
    }
}
