package com.example.v1.resource;

import com.example.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.SecurityContext;


@Path("greeting")
public class GreetingResourceV1 {

    @Autowired
    private GreetingService service;


    @GET
    public String getGreeting(@Context SecurityContext sc) {
        final String name = sc.getUserPrincipal().getName();
        return service.getGreeting(name, "v1");
    }
}
