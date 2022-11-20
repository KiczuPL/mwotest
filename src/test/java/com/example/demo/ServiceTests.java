package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
public class ServiceTests {

    @Test
    public void test(){
        int a=4,b=6;
        Service service = new Service();
        
        int result = service.add(a,b);

        Assert.isTrue(result == a+b);
    }

}
