package org.java.hibernate;

import java.nio.channels.SeekableByteChannel;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.java.hibernate.entity.User;

public class GetDataList {

	public static void main(String[] args) {
		 
		SessionFactory factory = new Configuration().configure().addAnnotatedClass(User.class).buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try {
			
			session.beginTransaction();
			
			List<User> users = session.createQuery("from user").getResultList();
			
			for (User user : users) {
				System.out.println(user);
			}
			
		} finally {
			session.close();
			factory.close();
		}
	}
}
