package com.zensar.daos;



import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.zensar.entities.User;

/**
 * @author Chetna Khapre
 *@version 2.0
 *@modification date 28/09/2019 11:11 am
 *
 */

@Entity
public class UserDaoImpl implements UserDao {
	
	private Session session;
	public UserDaoImpl() {
		Configuration c = new Configuration().configure();
		SessionFactory f = c.buildSessionFactory();
		session = f.openSession();
		
	
	}
	@Override
	public void insert(User user) {
		Transaction t = session.beginTransaction();
		session.save(user);
	}

	@Override
	public void update(User user) {
		Transaction t = session.beginTransaction();
		session.update(user);		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(User user) {
		Transaction t = session.beginTransaction();
		session.delete(user);
		
	}

	@Override
	public User getByUsername(String username) {
		Transaction t = session.beginTransaction();
		
		return session.get(User.class, username);
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		Query q = session.createQuery("from User");
		return q.getResultList();
	}



}
