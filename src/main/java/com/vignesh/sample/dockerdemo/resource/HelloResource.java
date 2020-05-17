package com.vignesh.sample.dockerdemo.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/api/docker/hello")
public class HelloResource {

    @GetMapping
    public String hello() {
        return "Hello from Vignesh";
    }
}
