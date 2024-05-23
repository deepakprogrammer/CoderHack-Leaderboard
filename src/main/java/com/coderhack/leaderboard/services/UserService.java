package com.coderhack.leaderboard.services;

import com.coderhack.leaderboard.dto.User;
import com.coderhack.leaderboard.entities.UserEntity;
import com.coderhack.leaderboard.repositoryServices.UserRepositoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepositoryService userRepositoryService;
    public List<UserEntity> getAllUsers(){
        return userRepositoryService.getAllUsers();
    }
}
