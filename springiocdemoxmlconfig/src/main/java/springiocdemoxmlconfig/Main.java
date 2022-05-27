package springiocdemoxmlconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("bean-config.xml");
		Employee emp = ac.getBean("e3", Employee.class);
		emp.display();
		Department dept = ac.getBean(Department.class);
		dept.show();
	}
}
