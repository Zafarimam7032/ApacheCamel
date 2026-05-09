package com.zafar.cammel.AppacheCammelSeconf.route;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class ApacheCamelConsumer extends RouteBuilder{

    @Override
    public void configure() throws Exception {

        from("activemq:camelqueuezafar")
                .log("${body}");
    }
}
