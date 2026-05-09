package com.zafar.apacheCamel.AppacheCamel.config;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class HttpClientRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {
//        from("timer:active?period=100")
//                .to("http://localhost:2121/hello")
//                .log("${body}");
    }
}
