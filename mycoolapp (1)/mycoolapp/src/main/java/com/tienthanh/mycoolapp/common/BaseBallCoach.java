package com.tienthanh.mycoolapp.common;

import org.springframework.stereotype.Component;

@Component
public class BaseBallCoach implements Coach{

    public BaseBallCoach(){
        System.out.println("Initializing baseball coach");
    }
    @Override
    public String getDailyWorkout() {
        return "you should play baseball";
    }
}
