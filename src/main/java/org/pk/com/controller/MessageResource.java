package org.pk.com.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MessageResource {

    @Value("${environment}")
    String environment;

    @Value("${server.port}")
    String port;

    @GetMapping("/message")
    public String getMessage(){
        return environment + " Running on Port Number "+ port;
    }

}
