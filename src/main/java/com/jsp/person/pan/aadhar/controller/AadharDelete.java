package com.jsp.person.pan.aadhar.controller;

import com.jsp.person.pan.aadhar.service.AadharService;

public class AadharDelete {

	public static void main(String[] args) {

		AadharService aadharService = new AadharService();

		aadharService.deleteAadharById(3);

	}

}
