package com.example.webservice2.controller;

import com.example.webservice2.service.FuckServices;
import com.example.webservice2.service.VUser;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Fuck2Controller {
    @Autowired
    RestTemplate restTemplate;
    @Autowired
    FuckServices fuckServices;

    @HystrixCommand(fallbackMethod = "fallbackz")
    @RequestMapping("fuck2")
    public String fuck2(){
        String body = restTemplate.getForEntity("http://SERVICE1/fuck", String.class).getBody();
        System.out.println(body);
        return body;
    }
    public String fallbackz(){
        System.out.println("ggsmz");
        return "服务1宕机";
    }

    @RequestMapping("fuck3")
    public String fuck3(){
        String hello = fuckServices.hello();
        return hello;
    }

    @RequestMapping("fuck4")
    public VUser fuck4(){
        VUser vUser = new VUser();
        vUser.setAge("orz");
        vUser.setName("orzz");
        VUser hello = fuckServices.hello(vUser);
        return hello;
    }
}
