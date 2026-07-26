package com.quickbite.authservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class QuickbiteAuthServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuickbiteAuthServiceApplication.class, args);
	}

}
