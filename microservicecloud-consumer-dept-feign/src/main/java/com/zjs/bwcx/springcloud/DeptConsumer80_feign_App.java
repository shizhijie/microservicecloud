package com.zjs.bwcx.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.zjs.bwcx.springcloud"})
@ComponentScan(value="com.zjs.bwcx.springcloud")
public class DeptConsumer80_feign_App {
	public static void main(String[] args) {
		SpringApplication.run(DeptConsumer80_feign_App.class, args);
	}
}
