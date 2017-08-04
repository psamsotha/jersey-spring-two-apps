package com.example.service;

import org.springframework.stereotype.Component;

@Component
public class DefaultGreetingService implements GreetingService {

    @Override
    public String getGreeting(String name, String version) {
        return "Hello, " + name + "! (version " + version + ")";
    }
}
