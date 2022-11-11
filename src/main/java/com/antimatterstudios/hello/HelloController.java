package com.antimatterstudios.hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
    @RequestMapping("/")
    public String index() {
        System.out.println("Hello Raoul, I wrote a springboot service, lolcats");
        return "Hello World, version 3\n";
    }
}
