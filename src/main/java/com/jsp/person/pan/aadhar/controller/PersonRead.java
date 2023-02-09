package com.jsp.person.pan.aadhar.controller;

import com.jsp.person.pan.aadhar.service.PersonService;

public class PersonRead {

	public static void main(String[] args) {

		PersonService personService = new PersonService();

		personService.getPersonById(1);

	}

}
