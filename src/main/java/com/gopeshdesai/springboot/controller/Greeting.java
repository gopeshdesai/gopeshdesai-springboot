package com.gopeshdesai.springboot.controller;

/**
 * Created by gopeshdesai on 10/8/16.
 */
public class Greeting {

    private String content;

    public Greeting(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}
