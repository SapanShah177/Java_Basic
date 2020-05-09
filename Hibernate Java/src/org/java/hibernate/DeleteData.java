package org.java.hibernate;

import java.nio.channels.SeekableByteChannel;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.java.hibernate.entity.User;

public class DeleteData {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure().addAnnotatedClass(User.class).buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try {
			User user = new User();
			session.beginTransaction();
			user = session.get(User.class, 2);
			session.delete(user);
			session.getTransaction().commit();
			System.out.println("Row Deleted.");
			
		} finally {
			session.close();
			factory.close();
		}
	}
}
