package com.jsp.person.pan.aadhar.controller;

import com.jsp.person.pan.aadhar.dto.Pan;
import com.jsp.person.pan.aadhar.service.PanService;

public class PanAllDetails {

	public static void main(String[] args) {

		PanService panService = new PanService();

		for (Pan p : panService.getAllPans()) {
			System.out.println("---------------");
			System.out.println(p.getId());
			System.out.println(p.getName());
			System.out.println(p.getPan_no());
		}
	}

}
