package com.baizhi.eurekaclientservice2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaClientService2Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientService2Application.class, args);
    }

}
