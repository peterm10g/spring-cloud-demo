package com.lsh.cloud.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages= {"com.lsh.cloud"})
@ComponentScan("com.lsh.cloud")
public class DeptConsumerFeign {
	public static void main(String[] args) {

		SpringApplication.run(DeptConsumerFeign.class, args);
	}
}
