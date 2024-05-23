package com.coderhack.leaderboard.repositoryServices;

import com.coderhack.leaderboard.dto.User;
import com.coderhack.leaderboard.entities.UserEntity;

import java.util.List;

public interface UserRepositoryService {
    List<UserEntity> getAllUsers();
    List<User> getUserById();
    User createUser(User user);
    User updateUserScore(String userId, Integer score);
    User deleteUser(String userId);
}
