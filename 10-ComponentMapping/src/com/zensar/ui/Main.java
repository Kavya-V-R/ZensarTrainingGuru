package com.zensar.ui;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.zensar.bean.Address;
import com.zensar.bean.Student;
import com.zensar.util.HibernateUtil;

public class Main {

	static void demo1() {
		HibernateUtil.init();
		Session session = HibernateUtil.getSession();

		Address address = new Address();
		address.setDoorNo("f-23");
		address.setAreaName("yelahanka");
		address.setCityName("banglore");

		Student student = new Student();
		student.setName("kavya");
		student.setAddress(address);

		Transaction tx = session.beginTransaction();
		session.save(student);
		tx.commit();

		HibernateUtil.cleanUp();
	}

	static void demo2() {
		HibernateUtil.init();
		Session session = HibernateUtil.getSession();

		Student student=null;
		student=session.load(Student.class,2);
		System.out.println(student);
		
		HibernateUtil.cleanUp();

	}
	static void demo3() {
		HibernateUtil.init();
		Session session = HibernateUtil.getSession();

		Student student = null;

		student = session.load(Student.class, 2);
		student.setName("mamtha");

		Transaction tx = session.beginTransaction();
		session.update(student);
		tx.commit();

		System.out.println(student);

		HibernateUtil.cleanUp();
	}
	

	static void demo4() {
		HibernateUtil.init();
		Session session = HibernateUtil.getSession();
		// HQL
		String str = "from Student";
		Query query = session.createQuery(str);
		List<Student> allstu = query.list();
		System.out.println(allstu);

		HibernateUtil.cleanUp();
	}

	static void demo5() {
		HibernateUtil.init();
		Session session = HibernateUtil.getSession();

		Student student = null;

		student = session.load(Student.class, 1);

		Transaction tx = session.beginTransaction();
		session.delete(student);
		tx.commit();

		System.out.println(student);

		HibernateUtil.cleanUp();
	}
	public static void main(String[] args) {
		//demo1();
		//demo2();
		//demo3();
		///demo4();
		demo5();

	}

}
