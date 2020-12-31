package com.neb.connection.resources;

import jdk.jfr.Registered;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service")
public class Pattern {

    @GetMapping("/ola")
    public String Hello(){

        return "Hello World";
    }
}
