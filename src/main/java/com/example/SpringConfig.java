package com.example;

import com.example.service.GreetingService;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = GreetingService.class)
public class SpringConfig {
}
