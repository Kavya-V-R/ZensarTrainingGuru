package com.zensar.ui;

import java.time.LocalDate;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import com.zensar.bean.Employee;
import com.zensar.util.HibernateUtil;

public class Main {

	static void demo1() {
		HibernateUtil.init();
		Session session = HibernateUtil.getSession();

		Employee employee = new Employee();
		employee.setName("kavya");
		employee.setDateOfJoin(LocalDate.of(2020, 12, 12));
		employee.setBasic(30000);
		employee.setGrade('b');

		Transaction tx = session.beginTransaction();

		session.save(employee);
		tx.commit();
		HibernateUtil.cleanUp();
	}

	static void demo2() {
		HibernateUtil.init();
		Session session = HibernateUtil.getSession();

		Employee employee = null;

		employee = session.load(Employee.class, 2);
		System.out.println(employee);
		HibernateUtil.cleanUp();
	}

	static void demo3() {
		HibernateUtil.init();
		Session session = HibernateUtil.getSession();

		Employee employee = null;

		employee = session.load(Employee.class, 2);
		employee.setBasic(60000);

		Transaction tx = session.beginTransaction();
		session.update(employee);
		tx.commit();

		System.out.println(employee);

		HibernateUtil.cleanUp();
	}

	static void demo4() {
		HibernateUtil.init();
		Session session = HibernateUtil.getSession();
		// HQL
		String str = "from Employee";
		Query query = session.createQuery(str);
		List<Employee> allemp = query.list();
		System.out.println(allemp);

		HibernateUtil.cleanUp();
	}

	static void demo5() {
		HibernateUtil.init();
		Session session = HibernateUtil.getSession();

		Employee employee = null;

		employee = session.load(Employee.class, 1);

		Transaction tx = session.beginTransaction();
		session.delete(employee);
		tx.commit();

		System.out.println(employee);

		HibernateUtil.cleanUp();
	}

	public static void main(String[] args) {
		// demo1();
		// demo2();
		// demo3();
		// demo4();
		// demo5();
	}
}
