package com.zafar.apacheCamel.AppacheCamel.beans;

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class MesageConfiguration {

    public String messageBuilder(){
        return "Hello Camel : "+ LocalDateTime.now();
    }
}
