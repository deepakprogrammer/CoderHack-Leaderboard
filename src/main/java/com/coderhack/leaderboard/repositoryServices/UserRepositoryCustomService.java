package com.coderhack.leaderboard.repositoryServices;

import com.coderhack.leaderboard.entities.UserEntity;

import java.util.List;

public interface UserRepositoryCustomService {
    List<UserEntity> findAllByOrderByScoreDesc();
}
