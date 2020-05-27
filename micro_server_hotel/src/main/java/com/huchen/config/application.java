package com.huchen.config;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication(scanBasePackages = "com.huchen")
@EnableEurekaClient
@MapperScan("com.huchen.mapper")
@EnableTransactionManagement
public class application {
    public static void main(String[] args) {
        SpringApplication.run(application.class,args);
    }
}
