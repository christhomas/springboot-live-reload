package com.antimatterstudios.hello.Model;

import java.util.Date;

public class Healthcheck {
    private Date now;

    private String data;

    public Healthcheck(String data) {
        this.now = new Date();
        this.data = data;
    }

    public Date getNow() {
        return this.now;
    }

    public String getData() {
        return this.data;
    }
}
