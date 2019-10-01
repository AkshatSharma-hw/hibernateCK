package com.zensar.hibernate.main;
import com.zensar.entities.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneToOneMappingDemo {

	public static void main(String[] args) {
		Configuration c = new Configuration().configure();
		SessionFactory f = c.buildSessionFactory();
		Session s = f.openSession();
		Transaction t = s.beginTransaction();
		
		Country con = new Country();
		con.setLanguage("hindi");
		con.setName("India");
		con.setPopulation(13000000);
		
		Flag f1 = new Flag();
		
		f1.setFlagName("tiranga");
		f1.setDescription("tri colour flag");
		
		f1.setCountry(con);
		con.setFlag(f1);

		s.save(con);
		s.save(f1);
		
		t.commit();
		s.close();

	}

}
