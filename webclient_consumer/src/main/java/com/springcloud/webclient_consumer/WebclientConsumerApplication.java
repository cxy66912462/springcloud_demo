package com.springcloud.webclient_consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class WebclientConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebclientConsumerApplication.class, args);
	}
}
