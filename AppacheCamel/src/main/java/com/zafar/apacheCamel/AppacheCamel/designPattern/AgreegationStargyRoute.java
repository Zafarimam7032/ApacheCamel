package com.zafar.apacheCamel.AppacheCamel.designPattern;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class AgreegationStargyRoute extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        from("timer:aggregate?period=1000")
                .setBody(constant("A,B,C,D,E"))
                .split(body().tokenize(","))
                .log("Aggregate message: ${body}")
                .aggregate(constant(true), (oldExchange, newExchange) -> {
                    if(oldExchange == null) {
                        return newExchange;
                    }
                    String oldBody = oldExchange.getIn().getBody(String.class);
                    String newBody = newExchange.getIn().getBody(String.class);
                    String aggregated = oldBody + "," + newBody;
                    oldExchange.getIn().setBody(aggregated);
                    return oldExchange;
                })
                .completionSize(3)
                .log("Aggregated message: ${body}");
    }
}
