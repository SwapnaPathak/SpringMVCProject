package com.org.wipro.dao;

import java.util.List;

import com.org.wipro.model.Course;

public interface CourseDao {
	
	public void addCourse(Course c);
	
	public List<Course> getAllCourse();
	
	public void deleteCourse(Course c);
	
	public void updateCourse(Course c);
	

}
