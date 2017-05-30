package com.org.wipro.service;

import java.util.List;

import com.org.wipro.model.Course;

public interface CourseService {
public void addCourse(Course c);
	
	public List<Course> getAllCourse();
	
	public void updateCourse(Course c);

	void deleteCourse(String id);
	


}
