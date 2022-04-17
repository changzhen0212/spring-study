package com.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author ChangZhen
 * @discription
 * @date 2022/4/17
 */
public class Test {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		User user = (User) context.getBean("user");
		System.out.println(user);
	}

}
