package com.zensar.ui.pack1;

import java.time.LocalDate;

import javax.persistence.EntityManager;

import com.zensar.bean.pack1.Address;
import com.zensar.bean.pack1.Employee;
import com.zensar.util.JPAUtil;

public class Main {

	static void test1() {

		Employee employee = new Employee(101, "kavya", 34454.54, null);
		Address address = new Address("e-4", "yelahanka", "banglore", null);

		employee.setAddress(address);
		address.setEmployee(employee);

		EntityManager em = JPAUtil.createEntityManager("PU");
		em.getTransaction().begin();
		em.persist(employee);
		em.getTransaction().commit();
		JPAUtil.shutDown();
	}

	static void test2() {
		Employee employee = null;
		EntityManager em = JPAUtil.createEntityManager("PU");
		employee = em.find(Employee.class, 101);
		System.out.println(employee);
		JPAUtil.shutDown();
	}

	public static void main(String[] args) {
		test2();

	}

}