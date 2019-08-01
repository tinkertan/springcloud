package com.baizhi.eurekaclientp1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class EurekaClientP1Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientP1Application.class, args);
    }

}
