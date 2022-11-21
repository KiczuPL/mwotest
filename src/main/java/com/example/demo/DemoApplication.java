package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;

@SpringBootApplication

public class DemoApplication {

	public static void main(String[] args) {

		System.out.println("Version: " + DemoApplication.class.getPackage().getImplementationVersion());
		SpringApplication.run(DemoApplication.class, args);
	}

}
