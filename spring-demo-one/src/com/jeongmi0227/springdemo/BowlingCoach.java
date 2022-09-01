package com.jeongmi0227.springdemo;

import org.springframework.beans.factory.DisposableBean;

public class BowlingCoach implements Coach, DisposableBean {
    private FortuneService fortuneService;
    public BowlingCoach(FortuneService fortuneService){
        this.fortuneService=fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "BowlingCoach getDailyWorkout!!!";
    }

    @Override
    public String getDailyFortune() {
        return "BowlingCoach getDailyFortune!!";
    }
    // add init method
    public void myStartMethod(){
        System.out.println("My Start Method!!!");
    }

    // add a destroy method for prototype
    @Override
    public void destroy() throws Exception {
        System.out.println("TrackCoach: inside method destroy");
    }
}
