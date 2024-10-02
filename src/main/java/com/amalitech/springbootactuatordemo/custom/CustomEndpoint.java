package com.amalitech.springbootactuatordemo.custom;

import jdk.jfr.Enabled;
import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

@Enabled
@Component
@Endpoint(id="mine")
public class CustomEndpoint {

    @ReadOperation
    public String hello() {
        return "Hello World";
    }
}
