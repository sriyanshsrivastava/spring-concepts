package com.sriyanshsrivastava.spring.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringCoreDemoApplication {

	public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(SpringCoreDemoApplication.class, args);
        Dev obj= context.getBean(Dev.class); // manual dependency injection
        obj.build();


	}

}
