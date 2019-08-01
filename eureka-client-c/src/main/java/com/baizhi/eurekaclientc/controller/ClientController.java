package com.baizhi.eurekaclientc.controller;

import com.baizhi.eurekaclientc.conf.FeignConfig;
import com.baizhi.eurekaclientc.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("consumer")
public class ClientController {
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private FeignConfig feignConfig;
    @RequestMapping("consumer")
    public String plintString(String name){
        System.out.println(name);
        String template = restTemplate.getForObject("http://eureka-client-p/producer/producer?name=" + name, String.class);
        return "8762:"+template;
    }
    @RequestMapping("feignConsumer2")
    public String feignConsumer(String name,String sex){
        System.out.println(name+sex);
        String feignProducer = feignConfig.feignProducer(name,sex);
        return "8762:"+feignProducer;
    }
    @RequestMapping("feignConsumer3")
    public String feignConsumer(User user){
        System.out.println(user.getName()+user.getSex());
        String feignProducer = feignConfig.feignProducer(user);
        return "8762:"+feignProducer;
    }
}
