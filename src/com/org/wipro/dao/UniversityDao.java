package com.org.wipro.dao;

import java.util.List;

import com.org.wipro.model.University;

public interface UniversityDao {
	
	public void addUniversity(University u);
    public List<University> listUniversity();

}
