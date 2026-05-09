package com.zafar.apacheCamel.AppacheCamel.config;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestBindingMode;

public class ApiCallRoute extends RouteBuilder {
    @Override
    public void configure() throws Exception {
//        restConfiguration().component("servlet").bindingMode(RestBindingMode.json);
//
//        rest().get("/hello")
//                .to("direct:hello");
//
//        from("direct:hello")
//                .setBody(simple("{\"message\":\"Hello from Camel\"}"))
//                .log("api call ${body}");
    }
}
