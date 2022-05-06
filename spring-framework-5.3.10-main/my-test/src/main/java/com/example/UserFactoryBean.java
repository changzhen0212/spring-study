package com.example;

import org.springframework.beans.factory.FactoryBean;

/**
 * @author ChangZhen
 * @discription
 * @date 2022/5/6
 */
public class UserFactoryBean implements FactoryBean {

	@Override
	public Object getObject() throws Exception {
		return new User();
	}

	@Override
	public Class<?> getObjectType() {
		return User.class;
	}
}
