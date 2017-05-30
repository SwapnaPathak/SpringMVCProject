package com.org.wipro.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.org.wipro.model.Course;
import com.org.wipro.model.University;

@Repository("courseDao")
public class CourseDaoImpl implements CourseDao{

	@Autowired
	 private SessionFactory sessionFactory;


	@Override
	public void addCourse(Course c) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().saveOrUpdate(c);
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Course> getAllCourse() {
		// TODO Auto-generated method stub
		return (List<Course>) sessionFactory.getCurrentSession().createCriteria(Course.class).list();
	}

	@Override
	public void deleteCourse(Course c) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().delete(c);
		
	}

	@Override
	public void updateCourse(Course c) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().update(c);
		
	}

}
