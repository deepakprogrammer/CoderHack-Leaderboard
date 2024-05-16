package com.coderhack.leaderboard.repositoryServices;

import com.coderhack.leaderboard.entities.UserEntity;

import java.util.List;

public interface UserRepositoryService {
    List<UserEntity> getAllUsers();
    List<UserEntity> getUserById();
    UserEntity createUser(UserEntity user);
    UserEntity updateUserScore(String userId, Integer score);
    UserEntity deleteUser(String userId);
}
