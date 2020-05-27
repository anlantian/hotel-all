package com.huchen.config;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication(scanBasePackages = "com.huchen")
@EnableEurekaClient
public class application {
    public static void main(String[] args) {
        SpringApplication.run(application.class,args);
    }
}
