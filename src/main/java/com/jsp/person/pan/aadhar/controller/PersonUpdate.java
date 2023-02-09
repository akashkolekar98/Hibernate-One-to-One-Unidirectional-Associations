package com.jsp.person.pan.aadhar.controller;

import com.jsp.person.pan.aadhar.service.PersonService;

public class PersonUpdate {

	public static void main(String[] args) {

		PersonService personService = new PersonService();
		personService.updatePersonById(1, "Ajay", "ajay@gmail.com");

	}

}
