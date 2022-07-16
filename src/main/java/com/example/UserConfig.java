package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfig {
	@Bean
	public UserService userService() {
		return new UserService();
	}
	
	@Bean
	public String hello() {
		return "hello";
	}
}
