package com.example.RatingsDataservice.model;

import lombok.Data;

import java.util.List;

public @Data class UserRatings {

    private List<Rating> ratings;
}
