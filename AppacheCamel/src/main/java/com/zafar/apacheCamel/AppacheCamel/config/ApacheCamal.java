package com.zafar.apacheCamel.AppacheCamel.config;


import com.zafar.apacheCamel.AppacheCamel.beans.MesageConfiguration;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class ApacheCamal extends RouteBuilder {

    @Autowired
    private MesageConfiguration mesageConfiguration;

    @Override
    public void configure() throws Exception {
//        from("timer:anything?period=1000")
//                .setBody(constant("Hello World"))
//                .log("${body}")
//                .bean(mesageConfiguration)
//        .log("${body}");
//        from("timer:active?period=1000")
//                .transform().constant("active mq message : "+ LocalDateTime.now().toString())
//        .to("activemq:camelqueuezafar").end();
    }
}
