package com.jeongmi0227.springannotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

// Step 2: Add the @Component Annotation to your Java Class
// Spring will automatically register this bean and use the beanID of "thatSilly"
/**
 * Spring can generate a default beanID
 * Default beanID: the class name, make first letter lower-case
 */
//@Component("thatSilly")
@Component
public class TennisCoach implements Coach{
    /**
     * Spring will scan for a component that implements FortuneService interface
     * In this example, HappyFortuneService meets the requirements and then inject it here into our TennisCoach.
     */

    /**
     * Field Injection
     * Inject dependencies by setting field values on your class directly (even private fields)
     * It accomplished by using Java Reflection
     * 1. Configure the dependency injection with Autowired Annotation
     * - Applied directly to the field
     * - No need for setter methods
     */
    // Qualifier annotation : Specify unique bean with the beanID(default name - class name with lower case)
    @Autowired
    @Qualifier("randomFortuneService")
    private FortuneService fortuneService;
    // define a default constructor
    public TennisCoach(){
        System.out.println(">> TennisCoach:  inside default constructor");
    }


    // define any method for method injection
//    @Autowired
//    public void doSomeCoolStuff(FortuneService fortuneService){
//        System.out.println(">> TennisCoach:  inside default doSomeCoolStuff method");
//        this.fortuneService= fortuneService;
//    }
    // define a setter method
    /**
     * Setter Injection
     * 1. Create setter method(s) in your class for injections
     * 2. Configure the dependency injection with @Autowired Annotation
    */
//    @Autowired
//    public void setFortuneService(FortuneService fortuneService){
//        System.out.println(">> TennisCoach:  inside default setFortuneService method");
//        this.fortuneService= fortuneService;
//    }
    /**
     * Constructor Injection
     * 1. Define the dependency interface and class
     * 2. Create a constructor in your class for injections
     * 3. Configure the dependency injection with @Autowired Annotation
    */
    /*
    @Autowired
    public TennisCoach(FortuneService fortuneService){
        this.fortuneService=fortuneService;
    }*/
    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
