package com.jeongmi0227.springannotations;

import org.springframework.stereotype.Component;

/**
 * Practice Activity #4 - Inversion of Control with Java Annotations
 *
 * Define a new Coach implementation using Annotations
 * Reference the new coach implementation in your main application.
 * Test your application to verify you are getting information from your new coach implementation.
 */
@Component
public class BaseBallCoach implements Coach{

    @Override
    public String getDailyWorkout() {
        return "Practice Baseball";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}
