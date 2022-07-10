package com.jeongmi0227.springdemo;

public class BaseballCoach implements Coach{
    @Override
    public String getDailyWorkout(){
        return "Spend 30 minutes on batting practice";
    }
}
