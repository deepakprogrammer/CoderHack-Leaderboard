package com.coderhack.leaderboard.controller;

import com.coderhack.leaderboard.dto.User;
import com.coderhack.leaderboard.entities.UserEntity;
import com.coderhack.leaderboard.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/getAllUsers")
    public List<UserEntity> getAllUser() {
        return userService.getAllUsers();
    }

}
