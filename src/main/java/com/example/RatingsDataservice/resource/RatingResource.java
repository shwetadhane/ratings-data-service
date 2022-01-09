package com.example.RatingsDataservice.resource;

import com.example.RatingsDataservice.model.Rating;
import com.example.RatingsDataservice.model.UserRatings;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/ratingsdata")
public class RatingResource {

    @RequestMapping("/{movieId}")
    public Rating getRating (@PathVariable("movieId")  String movieId){
        return new Rating(movieId, 4);
    }

    @RequestMapping("user/{userId}")
    public UserRatings getUserRating (@PathVariable("userId") String userId){
        List<Rating> ratings = Arrays.asList(
                new Rating("1234", 4),
                new Rating("9876", 3)
        );
        UserRatings userRatings = new UserRatings();
        userRatings.setRatings(ratings);
        return userRatings;
    }
}
