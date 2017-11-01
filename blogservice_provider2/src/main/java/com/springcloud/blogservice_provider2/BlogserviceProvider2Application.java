package com.springcloud.blogservice_provider2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class BlogserviceProvider2Application {

	public static void main(String[] args) {
		SpringApplication.run(BlogserviceProvider2Application.class, args);
	}
}
