package com.zensar.hibernate.main;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.zensar.entities.Movie;
import com.zensar.entities.Song;

public class OneToManyDemo {

	public static void main(String[] args) {
		Configuration c = new Configuration().configure();
		SessionFactory f = c.buildSessionFactory();
		Session s = f.openSession();
		Transaction t = s.beginTransaction();
		
		Movie m = new Movie();
		m.setMoviename("m1");
		m.setReleaseDate(LocalDate.of(2018, 2, 15));
		
		Song s1 = new Song();
		s1.setSongName("s1");
		Song s2 = new Song();
		s2.setSongName("s2");
		List<Song> sl = new ArrayList<Song>();
		
		sl.add(s1);
		sl.add(s2);
		
		s1.setMovie(m);
		s2.setMovie(m);
		
		m.setSongs(sl);
		
		s.save(s1);
		s.save(s2);
		s.save(m);
		t.commit();
		s.close();


	}

}
