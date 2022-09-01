package com.jeongmi0227.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Bean Lifecycle
 *
 * Container Started -> Bean Instantiated -> Dependencies Injected -> Internal Spring Processing -> Your custom Init Method
 *
 * Methods / Hooks
 * You can add custom code during bean initialization
 * - Calling custom business logic methods
 * - Setting up handles resources(db, sockets, file etc)
 *
 * You can add custom code during bean destruction
 * - Calling custom business logic method
 * - Clean up handles to resources(db, sockets, files etc)
 *
 */
public class BeanLifeCycleDemoApp {
    public static void main(String[] args){

        // load the spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");

        // retrieve bean from spring container
        Coach theCoach = context.getBean("myCoach",Coach.class);

        Coach theProtoCoach = context.getBean("myBowling",Coach.class);

        System.out.println(theCoach.getDailyWorkout());

        System.out.println(theProtoCoach.getDailyWorkout());

        // close the context
        context.close();
    }
}
