package com.coderhack.leaderboard.repositoryServices;

import com.coderhack.leaderboard.entities.UserEntity;
import com.coderhack.leaderboard.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserRepositoryCustomServiceImpl implements UserRepositoryCustomService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public List<UserEntity> findAllByOrderByScoreDesc() {
        return mongoTemplate.findAll(UserEntity.class).stream().sorted(Comparator.comparingInt(UserEntity::getScore).reversed()).collect(Collectors.toList());
    }

}
