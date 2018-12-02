package com.minhhuyle.scweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EnvController {

    private final Environment env;

    @Autowired
    public EnvController(Environment env) {
        this.env = env;
    }

    @GetMapping("/")
    public String index() {
        return env.toString();
    }
}
