package com.jeongmi0227.springannotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class AnnotationDemoApp {
    public static void main(String[] args){
        // read spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springAnnotations-applicationContext.xml");
        // get the bean from spring container
//        Coach theCoach = context.getBean("thatSilly",Coach.class);
        Coach theCoach = context.getBean("tennisCoach",Coach.class);

        Coach baseBallCoach = context.getBean("baseBallCoach",Coach.class);
        // call a method on the bean
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(baseBallCoach.getDailyWorkout());
        // close the context
        context.close();
    }
}
