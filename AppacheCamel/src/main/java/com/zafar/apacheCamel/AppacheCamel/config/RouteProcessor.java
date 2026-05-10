package com.zafar.apacheCamel.AppacheCamel.config;

import com.zafar.apacheCamel.AppacheCamel.beans.ProcessorBeans;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RouteProcessor extends RouteBuilder {

    @Autowired
    private ProcessorBeans processorBeans;
    @Override
    public void configure() throws Exception {
        from("timer:foo?period=1000")
                .transform().constant("Hello from Camel at " + System.currentTimeMillis())
                .log("Processing message: ${body}")
                .process(processorBeans)
                .log("Message after processing: ${body}")
                .end();
    }
}
