package com.tienthanh.mycoolapp.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class TennisCoach implements Coach{
    public TennisCoach(){
        System.out.println("Initializng tennis coach");
    }
    @Override
    public String getDailyWorkout() {
        return "you should play Tennins";
    }
}
