package com.baizhi.eurekaclientp2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class EurekaClientP2Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientP2Application.class, args);
    }

}
