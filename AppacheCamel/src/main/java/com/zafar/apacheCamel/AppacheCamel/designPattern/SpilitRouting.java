package com.zafar.apacheCamel.AppacheCamel.designPattern;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class SpilitRouting extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        from("timer:split?period=1000")
                .setBody(constant("A,B,C,D,E"))
                .split(body().tokenize(","))
                .log("Split message: ${body}");
    }
}
