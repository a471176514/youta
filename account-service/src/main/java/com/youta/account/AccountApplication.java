package com.youta.account;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.amqp.RabbitAutoConfiguration;
import org.springframework.cloud.bus.BusAutoConfiguration;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication(exclude = { BusAutoConfiguration.class,RabbitAutoConfiguration.class})
@EnableDiscoveryClient
//@EnableOAuth2Client
@EnableFeignClients
@EnableCircuitBreaker
//@EnableGlobalMethodSecurity(prePostEnabled = true)
@MapperScan(basePackages = "com.youta.account.mapper")
public class AccountApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountApplication.class, args);
	}

}
