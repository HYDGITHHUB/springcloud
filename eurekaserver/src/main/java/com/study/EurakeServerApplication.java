package com.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

//声明该类是 Spring Boot 服务的入口。
@SpringBootApplication
//声明该类是一个 Eureka Server 微服务，提供服务注册和服务发现功能，即注册中心。
@EnableEurekaServer
public class EurakeServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurakeServerApplication.class,args);
    }
}
