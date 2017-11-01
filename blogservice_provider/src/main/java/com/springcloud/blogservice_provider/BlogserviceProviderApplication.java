package com.springcloud.blogservice_provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class BlogserviceProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(BlogserviceProviderApplication.class, args);
	}
}
