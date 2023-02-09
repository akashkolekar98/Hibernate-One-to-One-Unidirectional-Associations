package com.jsp.person.pan.aadhar.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.person.pan.aadhar.dto.Person;

public class PersonDao {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("AKASH");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public Person createPerson(Person person) {

		entityTransaction.begin();
		entityManager.persist(person);
		entityTransaction.commit();

		System.out.println("Person  Details Saved...");
		return person;
	}

	public Person deletePersonById(int id) {

		Person p1 = entityManager.find(Person.class, id);

		entityTransaction.begin();
		entityManager.remove(p1);
		entityTransaction.commit();

		System.out.println("Person details deleted....");
		return p1;
	}

	public Person updatePersonById(int id, String name, String gmail) {

		Person p1 = entityManager.find(Person.class, id);

		if (p1 != null) {
			p1.setName(name);
			p1.setGmail(gmail);
			entityTransaction.begin();
			entityManager.merge(p1);
			entityTransaction.commit();
		} else {
			System.out.println("Aadhar details not found...");
		}
		return p1;
	}

	public Person getPersonById(int id) {

		Person p1 = entityManager.find(Person.class, id);
		return p1;

	}

	public List<Person> getAllPersons() {

		String sql = "select s from Person s";
		Query query = entityManager.createQuery(sql);

		List<Person> persons = query.getResultList();

		return persons;
	}

}
