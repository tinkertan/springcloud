package com.baizhi.eurekaclientp1.controller;

import com.baizhi.eurekaclientp1.entity.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("producer")
public class ProducerController {
    @RequestMapping("producer")
    public String producer(String name){
        System.out.println(name);
        return "8763:"+name;
    }
    @RequestMapping("producer2")
    public String producer(@RequestParam("name") String name,@RequestParam("sex") String sex){
        System.out.println(name+sex);
        return "8763:"+name+sex;
    }
    @RequestMapping("producer3")
    public String producer(@RequestBody User user){
        System.out.println(user.getName()+user.getSex());
        return "8763:"+user.getName()+user.getSex();
    }
}
