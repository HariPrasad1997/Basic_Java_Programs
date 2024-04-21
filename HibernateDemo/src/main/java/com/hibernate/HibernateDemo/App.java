package com.hibernate.HibernateDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class App {
	public static void main(String[] args) {

		Alien alien = new Alien();
		alien.setAid(2);
		alien.setAname("Harsha");
		alien.setColor("Black");
//		System.out.println(alien.toString());

		Configuration configuration = new Configuration().configure().addAnnotatedClass(Alien.class);

		ServiceRegistry registry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties())
				.build();
		SessionFactory factory = configuration.buildSessionFactory(registry);

		Session session = factory.openSession();

		Transaction transaction = session.beginTransaction();

		session.save(alien);

		transaction.commit();
	}
}
