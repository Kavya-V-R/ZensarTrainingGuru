package com.zensar.ui.pack1;

import javax.persistence.EntityManager;

import com.zensar.bean.pack1.Course;
import com.zensar.bean.pack1.Subject;
import com.zensar.util.JPAUtil;

public class Main {

	private static void insertTesting() {
		EntityManager em = JPAUtil.createEntityManager("PU");

		Course course = new Course("Induction training", 32000.00);

		course.addSubject(new Subject("Spring", 42));
		course.addSubject(new Subject("JPA", 4));
		course.addSubject(new Subject("JQuery", 42));
		course.addSubject(new Subject("Angular Js", 42));
		course.addSubject(new Subject("Akax", 42));

		em.getTransaction().begin();
		em.persist(course);
		em.getTransaction().commit();

		System.out.println("\t\t !>>>>>>>>>>>>>>>> Course data saved <<<<<<<<<<<<<<<<<<");

	}

	private static void loadTesting() {
		EntityManager em = JPAUtil.createEntityManager("PU");
		Course course = em.find(Course.class, 1);
		System.out.println(course);
		JPAUtil.shutDown();
	}

	private static void loadAllTesting() {
		EntityManager em = JPAUtil.createEntityManager("PU");

	}

	private static void editTesting() {
		EntityManager em = JPAUtil.createEntityManager("PU");
		Course course = em.find(Course.class, 1);
		System.out.println(course);

		course.setFee(course.getFee() + 3000);
		course.setCourseName(course.getCourseName().toUpperCase());

		course.getSubjects().remove(em.find(Subject.class, 2));
		course.getSubjects().add(new Subject("React JS", 24));

		em.getTransaction().begin();
		em.merge(course);

		em.getTransaction().commit();
		JPAUtil.shutDown();
	}

	private static void deleteTesting() {
		EntityManager em = JPAUtil.createEntityManager("PU");
		em.getTransaction().begin();
		Course course = em.find(Course.class, 1);
		em.remove(course);

		em.getTransaction().commit();
		JPAUtil.shutDown();
	}

	public static void main(String[] args) {
		//insertTesting();
		// loadTesting();
		// editTesting();
		// deleteTesting();
		loadAllTesting();
	}

}
