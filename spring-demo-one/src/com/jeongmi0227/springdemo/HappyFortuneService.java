package com.jeongmi0227.springdemo;
// Constructor Injection
// 1. Define the dependency interface and class
// 2. Create a constructor in your class for injections
// 3. Configure the dependency injection in Spring config file
public class HappyFortuneService implements FortuneService{

    @Override
    public String getFortune() {
        return "Today is your lucky day!";
    }
}
