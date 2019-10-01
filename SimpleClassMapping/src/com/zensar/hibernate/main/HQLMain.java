package com.zensar.hibernate.main;

import org.hibernate.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class HQLMain {
	public static void main(String[] args, char[] p) {
		Configuration c = new Configuration().configure();
		SessionFactory f = c.buildSessionFactory();   //singleton and heavy weight session factory
		Session s1 = f.openSession();      //reprensents db connection and light weight
		Transaction t = s1.beginTransaction();
		
		
		/*
		 * Query q = s1.createQuery("select p.name, p.price from Product"); //JPA java
		 * persistent query
		 * 
		 * List<Product> prod = q .getResultList(); for(Product p1: prod)
		 * {System.out.println(p1);}
		 * 
		 * 
		 * 
		 * Query q = s1.createQuery("select p.name, p.price from Product"); //JPA java
		 * persistent query
		 * 
		 * List<Product> prod = q .getResultList(); for(Product p1: prod)
		 * {System.out.println(p1);}
		 * 
		 * 
		 * 
		 * 
		 * Query q = s1.createQuery("select p.name, p.price from Product"); //JPA java
		 * persistent query
		 * 
		 * List<Product> prod = q .getResultList(); for(Product p1: prod)
		 * {System.out.println(p1);}
		 */
		
		
		Query<?> q = s1.createQuery("select max(p.price) from Product p");
		Float max_price = (Float) q.getSingleResult();
		System.out.println(max_price);
		
		t.commit();
		s1.close();
		
	
	
	}

}
