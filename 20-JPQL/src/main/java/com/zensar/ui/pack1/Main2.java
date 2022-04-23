package com.zensar.ui.pack1;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.zensar.bean.pack1.Doctor;
import com.zensar.util.JPAUtil;

public class Main2 {

	static void test1() {
		EntityManager em = JPAUtil.createEntityManager("PU");
		TypedQuery<Doctor> query = em.createNamedQuery("findAll", Doctor.class);
		List<Doctor> doctor = query.getResultList();
		System.out.println(doctor);
		JPAUtil.shutDown();
	}

	static void test2() {
		EntityManager em = JPAUtil.createEntityManager("PU");
		TypedQuery<Doctor> query = em.createNamedQuery("findById", Doctor.class);
		query.setParameter("did", 1);
		Doctor doctor = query.getSingleResult();
		System.out.println(doctor);
		JPAUtil.shutDown();
	}

	static void test3() {
		EntityManager em = JPAUtil.createEntityManager("PU");
		Query query = em.createNamedQuery("findByfeesRange", Doctor.class);
		query.setParameter("start", 300.4);
		query.setParameter("end", 600.4);
		List doctor = query.getResultList();
		System.out.println(doctor);
		JPAUtil.shutDown();
	}

	public static void main(String[] args) {
		test3();
	}
}
