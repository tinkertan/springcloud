package com.baizhi.eurekaclientc.conf;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class EurekaConfiig {
    @Bean
    @LoadBalanced
    public RestTemplate getReatTemplate(){
        return new RestTemplate();
    }
}
