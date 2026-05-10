package com.zafar.apacheCamel.AppacheCamel.beans;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.stereotype.Component;

@Component
public class ProcessorBeans implements Processor {
    @Override
    public void process(Exchange exchange) throws Exception {
        String body = exchange.getIn().getBody(String.class);
        String modifiedBody = body.toUpperCase();
        exchange.getIn().setBody(modifiedBody);
    }
}
