package com.zensar.ui;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.zensar.bean.Account;

public class Main {

	static void demo1() {
		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("JPAAssignment");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();
		Account account = new Account();
		account.setName("navya");
		account.setBalance(434334);
		account.setDateOfOpening(LocalDate.of(2020, 12, 12));

		em.persist(account);// save

		em.getTransaction().commit();
		em.close();
		emf.close();
	}

	static void demo2() {
		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("JPAAssignment");
		EntityManager em = emf.createEntityManager();

		Account account = null;
		account = em.find(Account.class, 1); // session.load
		System.out.println(account);

		em.close();
		emf.close();
	}

	static void demo3() {
		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("JPAAssignment");
		EntityManager em = emf.createEntityManager();

		Account account = null;
		account = em.find(Account.class, 1); // session.load

		em.getTransaction().begin();

		account.setName(account.getName().toUpperCase());
		em.merge(account);// session.update
		em.getTransaction().commit();
		System.out.println(account);

		em.close();
		emf.close();
	}

	static void demo4() {
		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("JPAAssignment");
		EntityManager em = emf.createEntityManager();
		Account account = null;
		account = em.find(Account.class, 1); // session.load

		em.getTransaction().begin();

		em.remove(account);// session.delete

		em.getTransaction().commit();

		System.out.println(account);

		em.close();
		emf.close();
	}

	public static void main(String[] args) {
		demo1();
	}
}
