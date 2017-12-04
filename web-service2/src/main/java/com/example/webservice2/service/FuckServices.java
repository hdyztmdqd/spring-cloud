package com.example.webservice2.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("SERVICE1")
public interface FuckServices {
    @RequestMapping("fuck")
    String hello();

    @RequestMapping("fuckUser")
    VUser hello(VUser vUser);
}
