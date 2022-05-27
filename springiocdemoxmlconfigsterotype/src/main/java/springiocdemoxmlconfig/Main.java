package springiocdemoxmlconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("bean-config.xml");
		Employee emp = ac.getBean(Employee.class);
		emp.display();
		
	}
}
