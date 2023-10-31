package com.tienthanh.mycoolapp.common;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{

    public CricketCoach(){
        System.out.println("initializing cricket coach");
    }
    @Override
    public String getDailyWorkout() {
        return "push up 15 times !!";
    }
}
