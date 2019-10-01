package com.zensar.hibernate.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.zensar.entities.Product;

public class DbOperations {

	public static void main(String[] args) {
		Configuration c = new Configuration().configure();
		
		//singleton and heavy weight session factory
		SessionFactory f = c.buildSessionFactory();
		Session s = f.openSession(); //reprensents db connection and light weight
		Transaction t = s.beginTransaction(); 
		
		//insert new record
		//Product p = new Product(1003,"S", "JL", (float) 10000.00);
		
		Product p = s.get(Product.class, 1001);
		
		if(p!=null) {
			
			s.delete(p);
			
			//float price = p.getPrice();
			//p.setPrice((float)(price+2000));
			//p.setPrice((float)1500.00);
			//s.update(p);
			
			System.out.println("deleted");
		}
		else {
		System.out.println("Product not found.");
		}
		
		s.save(p);
		t.commit();
		s.close();
		
		
		
		

	}

}
