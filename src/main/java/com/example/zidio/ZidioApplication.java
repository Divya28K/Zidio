package com.example.zidio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
//import org.springframework.web.client.RestTemplate;
//import org.springframework.web.client.RestTemplate;



@SpringBootApplication
  @EntityScan(basePackages = "com.example.entity")
@ComponentScan(basePackages ="com.example.zidio")
@EnableJpaRepositories(basePackages="com.example.repository")
@EnableDiscoveryClient
@Configuration

@EnableEurekaServer

public class ZidioApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZidioApplication.class, args);
	}
}
//	@Bean
//	public RestTemplate restTemplate() {
//		return new RestTemplate();
//	}
//}


