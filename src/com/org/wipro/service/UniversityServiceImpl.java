package com.org.wipro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.org.wipro.dao.UniversityDao;
import com.org.wipro.model.University;

@Service("universityService")

public class UniversityServiceImpl implements UniversityService{

	@Autowired
	private UniversityDao universityDao;
	
	@Transactional
	@Override
	public void addUniversity(University u) {
		// TODO Auto-generated method stub
		universityDao.addUniversity(u);
		
	}
	@Transactional
	@Override
	public List<University> listUniversity() {
		// TODO Auto-generated method stub
		return universityDao.listUniversity();
	}

}
