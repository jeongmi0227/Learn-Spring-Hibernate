package com.jeongmi0227.springannotations;

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
    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }
}
