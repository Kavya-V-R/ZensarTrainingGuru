package com.zensar.ui.pack1;

import java.time.LocalDate;

import javax.persistence.EntityManager;

import com.zensar.bean.pack1.ContactInfo;
import com.zensar.bean.pack1.Person;
import com.zensar.util.JPAUtil;

public class Main {

	static void test1() {
		Person person = new Person(101, "John", LocalDate.of(1998, 2, 20), 'M', null);

		ContactInfo contactInfo = new ContactInfo("John@gmail.com", "9764736738");
		person.setContactinfo(contactInfo);

		EntityManager em = JPAUtil.createEntityManager("PU");
		em.getTransaction().begin();
		em.persist(person);
		em.getTransaction().commit();
		JPAUtil.shutDown();
	}

	static void test2() {
		ContactInfo contactInfo = new ContactInfo("mamtha@gmail.com", "7026756387");
		EntityManager em = JPAUtil.createEntityManager("PU");

		em.getTransaction().begin();
		em.persist(contactInfo);
		em.getTransaction().commit();
		JPAUtil.shutDown();
	}

	static void test3() {
		Person person = new Person(104, "mamtha", LocalDate.of(2020, 01, 10), 'F', null);

		EntityManager em = JPAUtil.createEntityManager("PU");
		ContactInfo contactInfo = em.find(ContactInfo.class, 4);
		person.setContactinfo(contactInfo);

		em.getTransaction().begin();
		em.persist(person);
		em.getTransaction().commit();
		JPAUtil.shutDown();
	}

	static void test4() {
		EntityManager em = JPAUtil.createEntityManager("PU");

		ContactInfo contactInfo = em.find(ContactInfo.class, 1);
		System.out.println(contactInfo);
		JPAUtil.shutDown();

	}

	static void test5() {
		EntityManager em = JPAUtil.createEntityManager("PU");
		Person person = em.find(Person.class, 101);
		System.out.println(person);
		// System.out.println(person.getContactinfo());
		JPAUtil.shutDown();
	}

	static void test6() {
		EntityManager em = JPAUtil.createEntityManager("PU");
		Person person = em.find(Person.class, 104);

		em.getTransaction().begin();
		em.remove(person);
		em.getTransaction().commit();
		JPAUtil.shutDown();
	}

	public static void main(String[] args) {
		test3();
	}
}
