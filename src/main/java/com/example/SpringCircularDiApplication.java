package com.example;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringCircularDiApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCircularDiApplication.class, args);
    }

//    @Bean
//    ApplicationRunner runner(ServiceA service) {
//        return args -> {
//            System.out.println(service.toString());
//        };
//    }
}
