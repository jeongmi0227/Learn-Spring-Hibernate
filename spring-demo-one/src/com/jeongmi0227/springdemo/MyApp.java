package com.jeongmi0227.springdemo;

// Inversion of Control (loC)
// The approach of outsourcing the construction and management of objects.
// It's simply the design process of externalizing, the construction and management of objects.
// Outsource to an object factory.

// application is going to outsource the creation and management of the objects,
// and that outsourcing will be handled by a object factory.

// MyApp.java: main method
// BaseballCoach.java
// Coach.java: interface after refactoring
// TrackCoach.java

// Spring container
// primary functions
// 1. Create and manage objects (Inversion of Control)
// 2. Inject object's dependencies (Dependency Injection)

// Configuring Spring Container
//  - XML configuration file(legacy, but most legacy apps still use this)
//  - Java Annotations(modern)
//  - Java Source Code(modern)

// Spring Development Process
// 1. Configure Spring Beans
// 2. Create a Spring Container
//  - Spring container is generally known as ApplicationContext
//  - Specialized implementations
//      * ClassPathXmlApplicationContext
//      * AnnotationConfigApplicationContext
//      * GenericWebApplicationContext
//      * others...
// 3. Retrieve Beans from Spring Container

public class MyApp {
    public static void main(String[] args){
        // create the object
        Coach theCoach = new TrackCoach();

        // user the object
        System.out.println(theCoach.getDailyWorkout());


    }
}
