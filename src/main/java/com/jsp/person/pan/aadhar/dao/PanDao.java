package com.jsp.person.pan.aadhar.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.person.pan.aadhar.dto.Pan;

public class PanDao {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("AKASH");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public Pan createPan(Pan pan) {

		entityTransaction.begin();
		entityManager.persist(pan);
		entityTransaction.commit();

		System.out.println("Pan  Details Saved...");
		return pan;
	}

	public Pan deletePanById(int id) {

		Pan p1 = entityManager.find(Pan.class, id);

		entityTransaction.begin();
		entityManager.remove(p1);
		entityTransaction.commit();

		System.out.println("Data Deleted....");
		return p1;
	}

	public Pan updatePanById(int id, String name, int pan_no) {

		Pan p1 = entityManager.find(Pan.class, id);

		if (p1 != null) {
			p1.setName(name);
			p1.setPan_no(pan_no);
			entityTransaction.begin();
			entityManager.merge(p1);
			entityTransaction.commit();
		} else {
			System.out.println("Pan Details not found...");
		}
		return p1;
	}

	public Pan getPanById(int id) {

		Pan p1 = entityManager.find(Pan.class, id);
		return p1;

	}

	public List<Pan> getAllPans() {

		String sql = "select s from Pan s";
		Query query = entityManager.createQuery(sql);

		List<Pan> pans = query.getResultList();

		return pans;
	}

}
