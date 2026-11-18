package com.example.lab7_20220851;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer // <-- Esta anotación es obligatoria para el servidor Eureka
public class Lab720220851Application {

    public static void main(String[] args) {
        SpringApplication.run(Lab720220851Application.class, args);
    }
}