package com.quickbite.serviceregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class QuickbiteServiceRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuickbiteServiceRegistryApplication.class, args);
	}

}
