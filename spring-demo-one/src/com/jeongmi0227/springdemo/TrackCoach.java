package com.jeongmi0227.springdemo;

import org.springframework.beans.factory.DisposableBean;

/**
 * Practice Activity #3 - Bean Scopes with XML Configuration
 *
 * 1. Add bean scopes to your new Coach implementation that you created in one of the previous activities.
 * 2. Test singleton scope and prototype scope as I did in the videos.
 * 3. Verify that the bean scopes are being applied as desired.
 */

public class TrackCoach implements Coach{

    private FortuneService fortuneService;
    public TrackCoach(){

    }
    public TrackCoach(FortuneService fortuneService){
        this.fortuneService=fortuneService;
    }
    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k";
    }

    @Override
    public String getDailyFortune() {
        return "Just Do It: "+fortuneService.getFortune();
    }

    // add an init method
    public void doMyStartupStuff(){
        System.out.println("TrackCoach: inside method doMyStartupStuff");
    }
    // add a destroy method
    public void doMyCleanupStuff(){
        System.out.println("TrackCoach: inside method doMyCleanupStuff");
    }

}
