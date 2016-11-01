package com.en;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

//@EnableDiscoveryClient
@SpringBootApplication
public class SonarServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SonarServiceApplication.class, args);
	}
}
