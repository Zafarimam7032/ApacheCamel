package com.zafar.apacheCamel.AppacheCamel.designPattern;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class MulticastRoute extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        from("timer:start")
                .multicast()
                .parallelProcessing()
                .log("Multicasting message: ${body}")
                .to("log:route1", "log:route2", "log:route3");

    }
}
