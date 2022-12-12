package com.example.helloworld;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.getMapping;
import org.springframwork.web.bind.annotation.RestController;

@SpringBootApplication
public class HelloworldApplication {

        @Value("${TARGET:World}")
        String target;

        @RestController
        clss helloworldController{
                @GetMapping("/")
                String hello() {
                        return "Hello" + target + "!";
                }
        }

        public static void main(String[] args) {
                SpringApplication.run(HelloworldApplication.class, args);
        }

}
