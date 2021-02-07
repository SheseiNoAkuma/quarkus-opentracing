package org.acme;

import org.eclipse.microprofile.opentracing.Traced;

import javax.enterprise.context.ApplicationScoped;

@Traced
@ApplicationScoped
public class TracedService {

    public String hello(String name) {
        return "Hello Service is here for " + name;
    }
}
