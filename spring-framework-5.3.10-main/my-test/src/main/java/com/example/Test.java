package com.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author ChangZhen
 * @discription
 * @date 2022/4/17
 */
public class Test {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(AppConfig.class);
		context.refresh();
		User user = (User) context.getBean("user", new User());
		System.out.println(user);
	}

}
