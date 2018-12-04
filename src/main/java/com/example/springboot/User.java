package com.example.springboot;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="girl")
public class User {

	private Integer age;

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	
}
