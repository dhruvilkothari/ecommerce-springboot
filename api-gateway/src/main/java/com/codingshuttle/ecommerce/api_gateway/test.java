package com.codingshuttle.ecommerce.api_gateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class test {
    @GetMapping("/test")
    public String handleTest(){
        return "TEST";
    }
}
