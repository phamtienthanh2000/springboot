package com.tienthanh.mycoolapp.rest;

import com.tienthanh.mycoolapp.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Lazy
public class Controller {
    Coach coach;
    @Autowired
    public Controller(@Qualifier("tennisCoach") Coach theCoach){
        this.coach = theCoach;
    }
    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        return coach.getDailyWorkout();
    }
}
