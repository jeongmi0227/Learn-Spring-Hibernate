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
public class BeanScopeDemoApp {
    public static void main(String[] args){

        // load the spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

        // retrieve bean from spring container
        Coach theCoach = context.getBean("myCoach",Coach.class);

        Coach alphaCoach = context.getBean("myCoach",Coach.class);
        // check if they are the same
        boolean result = (theCoach==alphaCoach);

        // print out the results
        System.out.println("\nPointing to the same object: "+result);
        System.out.println("\nMemory location for theCoach: "+theCoach);
        System.out.println("\nMemory location for alphaCoach: "+alphaCoach+"\n");

        // close the context
        context.close();
    }
}
