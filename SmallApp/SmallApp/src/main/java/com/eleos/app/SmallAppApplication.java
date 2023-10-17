package com.eleos.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.eleos.app")
public class SmallAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmallAppApplication.class, args);
	}

}
