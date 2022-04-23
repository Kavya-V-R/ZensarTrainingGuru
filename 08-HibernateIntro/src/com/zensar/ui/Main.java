package com.zensar.ui;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;
import org.hibernate.service.ServiceRegistry;

import com.zensar.bean.Person;

public class Main {

	static void demo1() {
		ServiceRegistry registry;
		registry = new StandardServiceRegistryBuilder().configure().build();
		MetadataSources metaSources = new MetadataSources(registry);
		Metadata metaData = metaSources.getMetadataBuilder().build();
		SessionFactory sessionFactory = metaData.getSessionFactoryBuilder()
				.build();
		Session session = sessionFactory.openSession();

		Person person = new Person();
		person.setName("Dini");
		person.setSalary(45000.00);

		Transaction tx = session.beginTransaction();

		session.save(person);
		tx.commit();
		session.close();
		sessionFactory.close();
	}

	static void demo2() {
		ServiceRegistry registry;
		registry = new StandardServiceRegistryBuilder().configure().build();
		MetadataSources metaSources = new MetadataSources(registry);
		Metadata metaData = metaSources.getMetadataBuilder().build();
		SessionFactory sessionFactory = metaData.getSessionFactoryBuilder()
				.build();
		Session session = sessionFactory.openSession();

		Person person = null;

		person = session.load(Person.class, 1);
		System.out.println(person);
		session.close();
		sessionFactory.close();
	}
	
	static void demo3() {
		ServiceRegistry registry;
		registry = new StandardServiceRegistryBuilder().configure().build();
		MetadataSources metaSources = new MetadataSources(registry);
		Metadata metaData = metaSources.getMetadataBuilder().build();
		SessionFactory sessionFactory = metaData.getSessionFactoryBuilder()
				.build();
		Session session = sessionFactory.openSession();

		Person person = null;

		person = session.load(Person.class, 1);
		person.setSalary(50000);
		
		Transaction tx=session.beginTransaction();
		session.update(person);
		tx.commit();
		
		System.out.println(person);
		
		session.close();
		sessionFactory.close();
	}
	
	static void demo4() {
		ServiceRegistry registry;
		registry = new StandardServiceRegistryBuilder().configure().build();
		MetadataSources metaSources = new MetadataSources(registry);
		Metadata metaData = metaSources.getMetadataBuilder().build();
		SessionFactory sessionFactory = metaData.getSessionFactoryBuilder()
				.build();
		Session session = sessionFactory.openSession();

		//HQL
		String str="from Person";
		Query query=session.createQuery(str);
		List<Person> allPersons=query.list();
		System.out.println(allPersons);
		
		session.close();
		sessionFactory.close();
	}
	
	static void demo5() {
		ServiceRegistry registry;
		registry = new StandardServiceRegistryBuilder().configure().build();
		MetadataSources metaSources = new MetadataSources(registry);
		Metadata metaData = metaSources.getMetadataBuilder().build();
		SessionFactory sessionFactory = metaData.getSessionFactoryBuilder()
				.build();
		Session session = sessionFactory.openSession();

		Person person = null;

		person = session.load(Person.class, 1);
		
		Transaction tx=session.beginTransaction();
		session.delete(person);
		tx.commit();
		
		System.out.println(person);
		
		session.close();
		sessionFactory.close();
	}
	

	public static void main(String[] args) {
		demo1();
		//demo2();
		//demo3();
		//demo4();
		//demo5();
	}
}
