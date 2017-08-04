package com.example.provider;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.NotAuthorizedException;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.SecurityContext;
import java.io.IOException;
import java.security.Principal;


public class AuthenticationFilter implements ContainerRequestFilter {

    @Context
    private HttpServletRequest servletRequest;


    @Override
    public void filter(ContainerRequestContext requestContext) throws IOException {
        final String auth = servletRequest.getHeader(HttpHeaders.AUTHORIZATION);
        if (auth == null || !auth.equals("Cool Guy")) {
            throw new NotAuthorizedException("Not Authorized");
        }
        requestContext.setSecurityContext(new SecurityContext() {
            @Override
            public Principal getUserPrincipal() {
                return () -> auth;
            }

            @Override
            public boolean isUserInRole(String s) { return false; }

            @Override
            public boolean isSecure() { return false; }

            @Override
            public String getAuthenticationScheme() { return null; }
        });
    }
}
