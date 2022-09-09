package com.jeongmi0227.springannotations;

/**
 * Constructor Injection
 * 1. Define the dependency interface and class
 * 2. Create a constructor in your class for injections
 * 3. Configure the dependency injection with @Autowired Annotation
 *
 * Setter Injection
 * 1. Create setter method(s) in your class for injections
 * 2. Configure the dependency injection with @Autowired Annotation
 */
public interface FortuneService {
    public String getFortune();
}
