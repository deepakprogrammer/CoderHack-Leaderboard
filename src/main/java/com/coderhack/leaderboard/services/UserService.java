package com.coderhack.leaderboard.services;


import com.coderhack.leaderboard.entities.UserEntity;
import com.coderhack.leaderboard.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<UserEntity> getAllUsers() {
        return userRepository.findAllByOrderByScoreDesc();
    }

    public UserEntity addUser(UserEntity user) {
        return userRepository.save(user);
    }
}
