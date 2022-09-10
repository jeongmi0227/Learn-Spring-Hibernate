package com.jeongmi0227.springannotations;

import org.springframework.stereotype.Component;

@Component
public class RESTFortuneService implements FortuneService{
    @Override
    public String getFortune() {
        return null;
    }
}
