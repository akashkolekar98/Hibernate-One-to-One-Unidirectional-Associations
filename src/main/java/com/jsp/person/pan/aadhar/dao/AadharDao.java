package com.jsp.person.pan.aadhar.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.person.pan.aadhar.dto.Aadhar;

public class AadharDao {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("AKASH");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public Aadhar createAadhar(Aadhar aadhar) {

		entityTransaction.begin();
		entityManager.persist(aadhar);
		entityTransaction.commit();

		System.out.println("aadhar  Details Saved...");
		return aadhar;
	}

	public Aadhar deleteAadharById(int id) {

		Aadhar a1 = entityManager.find(Aadhar.class, id);

		entityTransaction.begin();
		entityManager.remove(a1);
		entityTransaction.commit();

		System.out.println("Aadhar details deleted....");
		return a1;
	}

	public Aadhar updateAadharById(int id, String name, int aadhar_no) {

		Aadhar a1 = entityManager.find(Aadhar.class, id);

		if (a1 != null) {
			a1.setName(name);
			a1.setAadhar_no(aadhar_no);
			entityTransaction.begin();
			entityManager.merge(a1);
			entityTransaction.commit();
		} else {
			System.out.println("Aadhar details not found...");
		}
		return a1;
	}

	public Aadhar getAadharById(int id) {

		Aadhar a1 = entityManager.find(Aadhar.class, id);
		return a1;

	}

	public List<Aadhar> getAllAadhars() {
		String sql = "select s from Aadhar s";
		Query query = entityManager.createQuery(sql);

		List<Aadhar> aadhars = query.getResultList();

		return aadhars;
	}

}
