package com.example.webservice1.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class FuckController {

    @RequestMapping("fuck")
    public String fuck(){
        try {
            Random random = new Random();
            int i = random.nextInt(3000);
            Thread.sleep(i);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "fuck you!from service1";
    }

    @RequestMapping("fuckUser")
    public VUser fuck(@RequestBody VUser vUser){
        System.out.println("provider:from customer-"+vUser);
        vUser.setName("qq");
        vUser.setAge("ww");
        return vUser;
    }
}
