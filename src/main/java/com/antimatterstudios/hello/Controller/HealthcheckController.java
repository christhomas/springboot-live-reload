package com.antimatterstudios.hello.Controller;

import org.springframework.web.bind.annotation.RestController;

import com.antimatterstudios.hello.Model.Healthcheck;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController()
public class HealthcheckController {
    @RequestMapping(path = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    public Healthcheck index() {
        System.out.println("Hello Raoul, I wrote a springboot service, lolcats, this is shitty, but lets try it anyway");
        return new Healthcheck("Healthcheck");
    }
}
