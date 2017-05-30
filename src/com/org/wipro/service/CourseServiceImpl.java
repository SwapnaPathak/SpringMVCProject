package com.org.wipro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.org.wipro.dao.CourseDao;
import com.org.wipro.model.Course;

@Service("courseService")
public class CourseServiceImpl implements CourseService{

	@Autowired
	private CourseDao courseDao;
	
	@Transactional	
	@Override
	public void addCourse(Course c) {
		// TODO Auto-generated method stub
		courseDao.addCourse(c);
		
	}
	@Transactional
	@Override
	public List<Course> getAllCourse() {
		// TODO Auto-generated method stub
		return courseDao.getAllCourse();
	}
	@Transactional
	@Override
	public void deleteCourse(String id) {
		// TODO Auto-generated method stub
		Course c =new Course();
		c.setCourseId(id);
		courseDao.deleteCourse(c);
		
	}
	@Transactional
	@Override
	public void updateCourse(Course c) {
		// TODO Auto-generated method stub
		courseDao.updateCourse(c);
		
	}

}
