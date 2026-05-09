package com.zafar.cammel.AppacheCammelSeconf.controller;

import com.zafar.cammel.AppacheCammelSeconf.controller.model.CammelRequest;
import org.springframework.web.bind.annotation.*;

@RestController
public class CamelController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello World!";
    }

    @PostMapping("/send")
    public String send(@RequestBody CammelRequest request) {
        return "Message received: " + request.getMessage();
    }
}
