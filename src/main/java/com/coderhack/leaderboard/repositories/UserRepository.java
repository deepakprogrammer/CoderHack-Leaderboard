package com.coderhack.leaderboard.repositories;

import com.coderhack.leaderboard.entities.UserEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<UserEntity, String> {
}
