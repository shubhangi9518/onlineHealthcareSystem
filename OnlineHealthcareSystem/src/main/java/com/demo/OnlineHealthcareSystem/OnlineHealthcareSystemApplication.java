package com.demo.OnlineHealthcareSystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"com.demo.OnlineHealthcareSystem","com.controller","com.dao","com.model","com.service"})
@EntityScan("com.model")
@EnableJpaRepositories(basePackages="com.dao")
public class OnlineHealthcareSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlineHealthcareSystemApplication.class, args);
	}

}
