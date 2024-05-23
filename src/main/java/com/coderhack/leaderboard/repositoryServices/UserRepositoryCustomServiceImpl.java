package com.coderhack.leaderboard.repositoryServices;
import com.coderhack.leaderboard.dto.User;
import com.coderhack.leaderboard.entities.UserEntity;
import com.coderhack.leaderboard.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserRepositoryCustomServiceImpl implements UserRepositoryCustomService {

    @Autowired
    private UserRepository userRepository;


    @Override
    public List<User> findAllByOrderByScoreDesc() {
    	 
        //return userRepository.findAll(UserEntity.class).stream().sorted(Comparator.comparingInt(UserEntity::getScore).reversed()).collect(Collectors.toList());
    	return List.of();
    }

}
