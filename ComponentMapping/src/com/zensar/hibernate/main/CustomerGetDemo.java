package com.zensar.hibernate.main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.Reader;
import java.sql.Blob;
import java.sql.Clob;
import java.sql.SQLException;
import java.time.LocalDate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.engine.jdbc.BlobProxy;

import com.zensar.entities.Customer;
import com.zensar.entities.Name;

public class CustomerGetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration c= new Configuration().configure();
		SessionFactory f = c.buildSessionFactory();
		Session s = f.openSession();
		Transaction t = s.beginTransaction();
		
		Customer c1 = s.get(Customer.class, 105);
		System.out.println(c1.getCustomerId());
		System.out.println(c1.getAge());
		
		Name name1 = c1.getCustomerName();
		System.out.println(name1);
		
		Blob customerPhoto = c1.getProfilePhoto();
		try {
			InputStream in = customerPhoto.getBinaryStream();
			FileOutputStream fout = new FileOutputStream("./resources/pic.jfif");
			int data = 0;
			while((data= in.read())!= -1) {
				fout.write(data);
			}
			in.close();
			fout.close();
		
			Clob description = c1.getDescription();
			Reader r = description.getCharacterStream();
			PrintWriter pw  = new PrintWriter("./resources/cdb.txt");
						
			int charData = 0;
			while((charData = r.read())!= -1) {
				pw.print((char)charData);
			}
			
			r.close();
			pw.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println();
			t.commit();
			s.close();
	}
}


