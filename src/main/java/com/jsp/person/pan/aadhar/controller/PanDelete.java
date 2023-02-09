package com.jsp.person.pan.aadhar.controller;

import com.jsp.person.pan.aadhar.service.PanService;

public class PanDelete {

	public static void main(String[] args) {

		PanService panService = new PanService();
		panService.deletePanById(4);

	}

}
