package com.zensar.ui;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.zensar.bean.Address;
import com.zensar.bean.Student;

public class Main {

	static void demo1() {
		Address address = new Address();
		address.setDoorNo("g-6");
		address.setAreaName("yelahanka");
		address.setCityName("bengaluru");

		Student student = new Student();
		student.setName("kavya");
		student.setAddress(address);

		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("JPAIntro");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();
		em.persist(student);
		em.getTransaction().commit();
		em.close();
		emf.close();
	}

	static void demo2() {
		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("JPAIntro");
		EntityManager em = emf.createEntityManager();

		Student student = null;
		student = em.find(Student.class, 1); // session.load
		System.out.println(student);

		em.close();
		emf.close();
	}

	static void demo3() {
		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("JPAIntro");
		EntityManager em = emf.createEntityManager();

		Student student = null;
		student = em.find(Student.class, 1); // session.load

		em.getTransaction().begin();

		student.setName(student.getName().toUpperCase());
		student.getAddress().setAreaName("tumkur");

		em.merge(student);// session.update
		em.getTransaction().commit();
		System.out.println(student);

		em.close();
		emf.close();
	}

	static void demo4() {
		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("JPAIntro");
		EntityManager em = emf.createEntityManager();
		Student student = null;
		student = em.find(Student.class, 1); // session.load

		em.getTransaction().begin();

		em.remove(student);// session.delete

		em.getTransaction().commit();

		System.out.println(student);

		em.close();
		emf.close();
	}

	public static void main(String[] args) {
		demo3();
	}

}
