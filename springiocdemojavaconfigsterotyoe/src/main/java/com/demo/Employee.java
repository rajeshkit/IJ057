package com.demo;

import org.springframework.stereotype.Component;

@Component
public class Employee {
	public void display() {
		System.out.println("Employee class display method called: "+this.hashCode());
	}
}
