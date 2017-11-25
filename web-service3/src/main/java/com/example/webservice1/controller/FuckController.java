package com.example.webservice1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FuckController {

    @RequestMapping("fuck")
    public String fuck(){
        return "fuck you! from service3";
    }

    @RequestMapping("fuckUser")
    public VUser fuck(VUser vUser){
        vUser.setName("qq");
        vUser.setAge("ww");
        System.out.println("provider:from customer-"+vUser);
        return vUser;
    }
}
