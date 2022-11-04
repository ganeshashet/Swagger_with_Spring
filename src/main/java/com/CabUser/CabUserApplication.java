package com.CabUser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

// swagger dependency using with output in html webpage instaned of using postman
@EnableSwagger2
@SpringBootApplication
public class CabUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(CabUserApplication.class, args);
	}

}
