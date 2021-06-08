package com.gridu.spring.task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("greeter")
public class Greeter {
    
    @Autowired
    private GreetingFormatter formatter;
    
    @Value("${name}")
    private String name;
    
    @Value("${title}")
    private String title;
    
    private String fullName;
    
    public Greeter() {
        this("World");
    }

    public Greeter(String name) {
        this.name = name;
    }

    public void afterPropertiesSet() {
        if (title == null) {
            throw new IllegalStateException("Title should not be null");
        }
        if (name == null) {
            throw new IllegalStateException("Name should not be null");
        }
        this.fullName = title.concat(name);
    }
    
    public void greet(String name) {
        System.out.println(formatter.format(name));
    }
    
    public void greet() {
        System.out.println(formatter.format(fullName));
    }
}
