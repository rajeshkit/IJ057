package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext ac=new AnnotationConfigApplicationContext(JavaBeanConfig.class);
		Employee emp = ac.getBean("e1",Employee.class);
		emp.display();
		Department dept = ac.getBean("d1",Department.class);
		dept.show();
	}
}
