package com.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaBeanConfig {
	@Bean(name = "e1")
	public Employee getEmployee1() {
		return new Employee();
	}
	@Bean(name = "e2")
	public Employee getEmployee2() {
		return new Employee();
	}
	@Bean(name = "d1")
	public Department getDepartment() {
		return new Department();
	}
}
