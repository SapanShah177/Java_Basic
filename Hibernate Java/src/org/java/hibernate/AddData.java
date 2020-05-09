package org.java.hibernate;

import java.nio.channels.SeekableByteChannel;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.java.hibernate.entity.User;

public class AddData {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure().addAnnotatedClass(User.class).buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try {
			User user = new User("username", "password", "firstName", "lastName");
			session.beginTransaction();
			session.save(user);
			session.getTransaction().commit();
			System.out.println("Row Added.");
			
		} finally {
			session.close();
			factory.close();
		}
	}
}
