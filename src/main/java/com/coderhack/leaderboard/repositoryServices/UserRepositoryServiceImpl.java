package com.coderhack.leaderboard.repositoryServices;

import com.coderhack.leaderboard.entities.UserEntity;
import com.coderhack.leaderboard.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserRepositoryServiceImpl implements UserRepositoryService{

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserRepositoryCustomService userRepositoryCustom;

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public List<UserEntity> getAllUsers() {
        return List.of();
    }

    @Override
    public List<UserEntity> getUserById() {
        return List.of();
    }

    @Override
    public UserEntity createUser(UserEntity user) {
        return null;
    }

    @Override
    public UserEntity updateUserScore(String userId, Integer score) {
        return null;
    }

    @Override
    public UserEntity deleteUser(String userId) {
        return null;
    }
}
