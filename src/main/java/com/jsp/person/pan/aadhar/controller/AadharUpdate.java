package com.jsp.person.pan.aadhar.controller;

import com.jsp.person.pan.aadhar.service.AadharService;

public class AadharUpdate {

	public static void main(String[] args) {

		AadharService aadharService = new AadharService();

		aadharService.updateAadharById(1, "Akash", 12345);
	}

}
