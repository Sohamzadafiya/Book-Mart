package com.ApiGateway;

import org.springframework.boot.SpringApplication;



//import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class ApiGayewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiGayewayApplication.class, args);
	}

}
