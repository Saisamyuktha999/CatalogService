package com.catelog.catelogservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.catelog")
public class CatelogServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CatelogServiceApplication.class, args);
	}

}
