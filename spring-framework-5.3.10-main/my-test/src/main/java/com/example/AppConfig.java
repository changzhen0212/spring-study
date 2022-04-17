package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author ChangZhen
 * @discription
 * @date 2022/4/17
 */
@Configuration
@ComponentScan
public class AppConfig {

	@Bean
	public User user() {
		return new User(1L, "ChangZhen");
	}
}
