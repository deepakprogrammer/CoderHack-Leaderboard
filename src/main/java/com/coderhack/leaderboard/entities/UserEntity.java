package com.coderhack.leaderboard.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotNull;
import java.util.Set;

@Data
@Document(collation = "users")
@NoArgsConstructor
public class UserEntity {

    @Id
    private String userId;

    @NotNull
    private String userName;

    @NotNull
    private Integer score;

    @NotNull
    private Set<Badge> badges;
}
