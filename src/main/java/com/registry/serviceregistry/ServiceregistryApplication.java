package com.registry.serviceregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@SpringBootApplication
@EnableEurekaServer
public class ServiceregistryApplication {

	public static void main(String[] args) {
		System.out.println("Hello registry");
		SpringApplication.run(ServiceregistryApplication.class, args);
	}
}
