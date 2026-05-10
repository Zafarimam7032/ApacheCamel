package com.zafar.apacheCamel.AppacheCamel.designPattern;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class PipeLineRoute extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        from("timer:active?period=1000")
                .pipeline("direct:step1", "direct:step2", "direct:step3")
                .log("Pipeline completed");

        from("direct:step1")
                .log("Executing Step 1")
                .transform().constant("Data after Step 1");
        from("direct:step2")
        .log("Executing Step 2").end();

        from("direct:step3").log("Executing Step 3").end();
    }
}
