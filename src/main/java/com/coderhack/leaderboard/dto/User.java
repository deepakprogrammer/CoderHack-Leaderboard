package com.coderhack.leaderboard.dto;

import com.coderhack.leaderboard.entities.Badge;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class User {
    @NotNull
    private String userId;
    @NotNull
    private String userName;
    @NotNull
    private Integer score;
    @NotNull
    private Set<Badge> badges;
}
