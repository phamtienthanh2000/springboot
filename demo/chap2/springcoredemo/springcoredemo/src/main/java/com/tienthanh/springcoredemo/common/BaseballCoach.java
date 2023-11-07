package com.tienthanh.springcoredemo.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BaseballCoach implements Coach {

    @PostConstruct
    public void doMyStartupStuff(){
        System.out.println("In doMyStartupStuff "+getClass().getSimpleName());
    }

    @PreDestroy
    public void doCleanupStuff(){
        System.out.println("In doCleanupStuff "+getClass().getSimpleName());
    }

    public BaseballCoach() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Spend 30 minutes in batting practice";
    }
}