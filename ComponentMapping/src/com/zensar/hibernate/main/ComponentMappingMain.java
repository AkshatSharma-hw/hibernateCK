package com.zensar.hibernate.main;


import java.io.File;

import java.io.Reader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.Blob;
import java.sql.Clob;
import java.time.LocalDate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.engine.jdbc.BlobProxy;
import org.hibernate.engine.jdbc.ClobProxy;

import com.zensar.entities.Customer;
import com.zensar.entities.Name;

public class ComponentMappingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration c= new Configuration().configure();
		SessionFactory f = c.buildSessionFactory();
		Session s = f.openSession();
		Transaction t = s.beginTransaction();
		
		Name name = new Name();
		name.setFirstName("ansh");
		//name.setMiddleName();
		name.setLastName("kapoor");
		
		Customer customer = new Customer();
		customer.setCustomerId(105);
		customer.setCustomerName(name);
		customer.setGender("male");
		customer.setAge(20);
		customer.setDob(LocalDate.of(1997, 8, 22));
		try {
			File photo = new File("./resources/img.jfif");
			FileInputStream fin = new FileInputStream(photo);
			
			Blob customerphoto = BlobProxy.generateProxy(fin, photo.length()); 
			customer.setProfilePhoto(customerphoto);
			
			System.out.println();
			
			File file = new File("./resources/custDesc.txt");
			FileReader fi = new FileReader(file);
			
			Clob customerFile = ClobProxy.generateProxy(fi, file.length());
			customer.setDescription(customerFile);
			
			s.save(customer);
			t.commit();
			s.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
