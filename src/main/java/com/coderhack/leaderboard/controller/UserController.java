package com.coderhack.leaderboard.controller;

import com.coderhack.leaderboard.entities.UserEntity;
import com.coderhack.leaderboard.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<UserEntity> getAllUser() {
        return userService.getAllUsers();
    }

    @PostMapping("/addUser")
    public UserEntity addUser(@RequestBody UserEntity user) {
        return userService.addUser(user);
    }

    @GetMapping("/{userId}")
    public UserEntity getUserById(@PathVariable String userId) {
        return userService.getUserById(userId);
    }

    @DeleteMapping("/{userId}")
    public void deleteUser(@PathVariable String userId) {
        userService.deleteUser(userId);
    }

    @PutMapping("/{userId}")
    public UserEntity updateUser(@PathVariable String userId, @RequestParam int score) {
        return userService.updateUser(userId, score);
    }
}
