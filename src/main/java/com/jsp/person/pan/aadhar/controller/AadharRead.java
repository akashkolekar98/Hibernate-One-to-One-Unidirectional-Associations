package com.jsp.person.pan.aadhar.controller;

import com.jsp.person.pan.aadhar.service.AadharService;

public class AadharRead {

	public static void main(String[] args) {

		AadharService aadharService = new AadharService();

		aadharService.getAadharById(1);
	}

}
