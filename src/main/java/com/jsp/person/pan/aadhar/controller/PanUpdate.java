package com.jsp.person.pan.aadhar.controller;

import com.jsp.person.pan.aadhar.service.PanService;

public class PanUpdate {

	public static void main(String[] args) {

		PanService panService = new PanService();
		panService.updatePanById(1, "Akshay", 1116577);
	}

}
