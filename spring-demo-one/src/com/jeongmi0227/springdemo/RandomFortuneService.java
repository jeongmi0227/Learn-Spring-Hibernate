package com.jeongmi0227.springdemo;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class RandomFortuneService implements FortuneService{
    /**
     * Practice Activity #2 - Dependency Injection with XML Configuration
     *
     * 1. Define a new implementation for the FortuneService.
     *
     *     a. When the getFortune() method is called it should return a random fortune from the array.
     *
     *     b. Your fortune service should define three fortunes in an array.
     *
     * 2. Inject your new dependency into your Coach implementation.
     *
     * 3. Test your application to verify you are retrieving random fortunes.
     *
     * Compare your code to the solution. The solution is available here:
     * - http://www.luv2code.com/downloads/udemy-spring-hibernate/solution-practice-activities.zip
     */

    private String[] fortune={
            "This is first fortune","This is second fortune","This is third fortune"
    };

    private Random random= new Random();
    @Override
    public String getFortune() {
        int idx = random.nextInt(fortune.length);
        String theFortune = fortune[idx];
        return theFortune;
    }
}
