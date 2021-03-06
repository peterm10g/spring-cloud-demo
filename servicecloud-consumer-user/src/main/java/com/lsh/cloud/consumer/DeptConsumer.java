package com.lsh.cloud.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
@RibbonClient(name="MICROSERVICECLOUD-DEPT")
@EnableEurekaClient
public class DeptConsumer {
	public static void main(String[] args)
	{
		SpringApplication.run(DeptConsumer.class, args);
	}
}
