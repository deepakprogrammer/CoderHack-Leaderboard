package com.coderhack.leaderboard.repositoryServices;

import com.coderhack.leaderboard.dto.User;

import java.util.List;

public interface UserRepositoryCustomService {
    List<User> findAllByOrderByScoreDesc();
}
