package springiocdemoxmlconfig;

import org.springframework.stereotype.Component;

@Component    // sterotype annotation
public class Employee {
	public void display() {
		System.out.println("Employee class display method called: "+this.hashCode());
	}
}
