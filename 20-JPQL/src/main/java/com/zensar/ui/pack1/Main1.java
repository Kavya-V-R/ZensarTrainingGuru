package com.zensar.ui.pack1;

import java.time.LocalDate;

import javax.persistence.EntityManager;

import com.zensar.bean.pack1.Doctor;
import com.zensar.util.JPAUtil;

public class Main1 {

	public static void main(String[] args) {
		Doctor doctor1 = new Doctor("manya", 500, "Female", LocalDate.of(2006, 12, 12));
		Doctor doctor2 = new Doctor("kavya", 466, "Female", LocalDate.of(2006, 12, 12));
		Doctor doctor3 = new Doctor("dini", 600, "Male", LocalDate.of(2006, 12, 12));
		Doctor doctor4 = new Doctor("mamtha", 400, "Female", LocalDate.of(2006, 12, 12));
		Doctor doctor5 = new Doctor("venu", 700, "Male", LocalDate.of(2006, 12, 12));

		EntityManager em = JPAUtil.createEntityManager("PU");
		em.getTransaction().begin();
		em.persist(doctor1);
		em.persist(doctor2);
		em.persist(doctor3);
		em.persist(doctor4);
		em.persist(doctor5);

		em.getTransaction().commit();

		JPAUtil.shutDown();
		System.out.println("Doctor data Saved");

	}
}
