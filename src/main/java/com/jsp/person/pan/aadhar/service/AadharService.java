package com.jsp.person.pan.aadhar.service;

import java.util.List;

import com.jsp.person.pan.aadhar.dao.AadharDao;
import com.jsp.person.pan.aadhar.dto.Aadhar;

public class AadharService {

	AadharDao aadharDao = new AadharDao();

	public Aadhar createAadhar(Aadhar aadhar) {

		return aadharDao.createAadhar(aadhar);
	}

	public Aadhar deleteAadharById(int id) {

		return aadharDao.deleteAadharById(id);
	}

	public Aadhar updateAadharById(int id, String name, int aadhar_no) {

		return aadharDao.updateAadharById(id, name, aadhar_no);
	}

	public Aadhar getAadharById(int id) {

		return aadharDao.getAadharById(id);

	}

	public List<Aadhar> getAllAadhars() {
		return aadharDao.getAllAadhars();
	}

}
