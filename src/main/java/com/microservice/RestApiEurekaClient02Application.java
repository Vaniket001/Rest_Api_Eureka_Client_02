package com.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class RestApiEurekaClient02Application {

	public static void main(String[] args) {
		SpringApplication.run(RestApiEurekaClient02Application.class, args);
		System.out.println("RestApiEurekaClient02Application Has Started !!");
	}

}
