package com.baizhi.eurekaclientc.conf;

import com.baizhi.eurekaclientc.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@FeignClient("eureka-client-p")
public interface FeignConfig {
    @RequestMapping("producer/producer2")
    public String feignProducer(@RequestParam("name") String name, @RequestParam("sex") String sex);
    @RequestMapping("producer/producer3")
    @ResponseBody
    public String feignProducer(User user);
}
