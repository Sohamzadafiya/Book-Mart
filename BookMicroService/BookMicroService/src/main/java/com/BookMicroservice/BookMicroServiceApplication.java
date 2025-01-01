package com.BookMicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableAutoConfiguration
@EnableJpaRepositories
@EnableConfigurationProperties
//@EnableDiscoveryClient
public class BookMicroServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookMicroServiceApplication.class, args);
	}

}
