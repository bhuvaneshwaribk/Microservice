package com.bitlabs.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServiceDiscovery1Application {

	public static void main(String[] args) {
		SpringApplication.run(ServiceDiscovery1Application.class, args);
	}

}
