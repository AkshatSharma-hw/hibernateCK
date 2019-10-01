package com.zensar.hibernate.main;


import java.time.LocalDate;

import org.hibernate.Session;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.zensar.entities.Employee;
import com.zensar.entities.WageEmp;

public class InheritanceMain {

	public static void main(String[] args) {
		Configuration c = new Configuration().configure();
		SessionFactory f = c.buildSessionFactory();
		Session s = f.openSession();
		Transaction t = s.beginTransaction();
		
		Employee e= new Employee();
		e.setJoinDate(LocalDate.of(2019, 8, 26));
		e.setName("ABC");
		e.setSalary(10000.00);
		
		s.save(e);
		
		WageEmp we = new WageEmp();
		we.setName("xyz");
		we.setJoinDate(LocalDate.of(2018, 3, 13));
		we.setHours(9);
		we.setRate((float)2.5);
		we.setSalary(we.getHours()*we.getRate());
		s.save(we);
	
		t.commit();
		s.close();

	}

}
