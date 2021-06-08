package com.gridu.spring.task;

import org.springframework.stereotype.Component;

@Component("formatter")
public class GreetingFormatter {
    private final static String FORMAT = "Hello, %s!";
    
    public String format(String name) {
        return String.format(FORMAT, name);
    }
}
