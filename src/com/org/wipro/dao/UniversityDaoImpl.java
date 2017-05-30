package com.org.wipro.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.org.wipro.model.University;

@Repository("universityDao")
public class UniversityDaoImpl implements UniversityDao{
	
	@Autowired
	 private SessionFactory sessionFactory;

	@Override
	public void addUniversity(University u) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().saveOrUpdate(u);
		
	}

	@Override
	public List<University> listUniversity() {
		// TODO Auto-generated method stub
		return (List<University>) sessionFactory.getCurrentSession().createCriteria(University.class).list();
	}

}
