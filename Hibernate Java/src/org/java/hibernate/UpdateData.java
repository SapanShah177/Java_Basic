package org.java.hibernate;

import java.nio.channels.SeekableByteChannel;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.java.hibernate.entity.User;

public class UpdateData {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure().addAnnotatedClass(User.class).buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try {
			User user = new User();
			session.beginTransaction();
			user = session.get(User.class, 1);
			user.setUsername("SapanShah");
			user.setPassword("1223345");
			user.setFirstName("Sapan");
			user.setLastName("Shah");
			session.getTransaction().commit();
			System.out.println(user);
			
		} finally {
			session.close();
			factory.close();
		}
	}
}
