package com.docker.id.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/api/test")
public class DemoApplication {

    @RequestMapping("/welcome")
    public String tes(){
        return "welcome docker";
    }
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}

