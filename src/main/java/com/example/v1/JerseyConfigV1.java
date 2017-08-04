package com.example.v1;

import com.example.provider.AuthenticationFilter;
import com.example.v1.resource.GreetingResourceV1;
import org.glassfish.jersey.server.ResourceConfig;


public class JerseyConfigV1 extends ResourceConfig {

    public JerseyConfigV1() {
        register(GreetingResourceV1.class);
        register(AuthenticationFilter.class);
    }
}
