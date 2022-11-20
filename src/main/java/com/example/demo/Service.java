package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;

@org.springframework.stereotype.Service
public class Service {

    public String add(Integer a, Integer b){
        return "\n"+(a+b);
    }

}
