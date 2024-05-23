package com.coderhack.leaderboard.repositoryServices;

import com.coderhack.leaderboard.entities.UserEntity;
import com.coderhack.leaderboard.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;
import com.coderhack.leaderboard.dto.User;

import java.util.List;

@Service
public class UserRepositoryServiceImpl implements UserRepositoryService{

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserRepositoryCustomService userRepositoryCustom;

    @Override
    public List<UserEntity> getAllUsers() {
        List<UserEntity> users = userRepository.findAll();
        return users;
    }

    @Override
    public List<User> getUserById() {
        return List.of();
    }

    @Override
    public User createUser(User user) {
        return null;
    }

    @Override
    public User updateUserScore(String userId, Integer score) {
        return null;
    }

    @Override
    public User deleteUser(String userId) {
        return null;
    }
}
