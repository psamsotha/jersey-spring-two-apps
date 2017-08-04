package com.example.v2;

import com.example.provider.AuthenticationFilter;
import com.example.v2.resource.GreetingResourceV2;
import org.glassfish.jersey.server.ResourceConfig;


public class JerseyConfigV2 extends ResourceConfig {

    public JerseyConfigV2() {
        register(GreetingResourceV2.class);
        register(AuthenticationFilter.class);
    }
}
