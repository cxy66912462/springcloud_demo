package com.springcloud.userservice_provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class UserserviceProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserserviceProviderApplication.class, args);
	}
}
