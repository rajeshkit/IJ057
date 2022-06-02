package cts.pms.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import cts.pms.model.Product;

public class Main {
	public static void main(String[] args) {
		Product p=new Product();
		p.setCost(4000);
		p.setProductId(100);
		p.setProductName("Clothes");
		p.setQuantity(4);
		
		Product p1=new Product();
		p1.setCost(67000);
		p1.setProductId(200);
		p1.setProductName("Gold");
		p1.setQuantity(3);
		
		SessionFactory sf=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session=sf.openSession();
		session.beginTransaction();
		session.save(p);
		session.save(p1);
		session.getTransaction().commit();
		session.close();
		sf.close();
		
	}

}
