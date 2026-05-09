package com.zafar.apacheCamel.AppacheCamel.config;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.dataformat.JsonLibrary;
import org.springframework.stereotype.Component;

@Component
public class FIleTransforRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("file:input")
                .choice()
                .when(simple("${file:ext} == 'txt'"))
                .log("Processing text file: ${file:name}")
                .to("file:output")
                .otherwise()
                .to("file:output/txt")
                .log("${body}").end();
    }
}
