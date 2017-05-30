package com.org.wipro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.org.wipro.model.Course;
import com.org.wipro.service.CourseService;

public class StudentController {
	@Autowired    
    private CourseService courseService;
	/*It displays a form to input data, here "command" is a reserved request attribute 
     *which is used to display object data into form 
     */  
	
	@RequestMapping(value = "/addCourse", method = RequestMethod.GET)
	public ModelAndView addCourse() {
	 
	   
     return new ModelAndView("addCourse")  ;
     }
   /* @RequestMapping("/addCourse")  
    public ModelAndView showform(){  
        return new ModelAndView("addCourse","command",new Course());  
    }  
*/    /*It saves object into database. The @ModelAttribute puts request data 
     *  into model object. You need to mention RequestMethod.POST method  
     *  because default request is GET*/  
    @RequestMapping(value="/save",method = RequestMethod.POST)  
    public ModelAndView save(@ModelAttribute("course") Course course){  
        courseService.addCourse(course);  
        return new ModelAndView("redirect:/viewCourse");//will redirect to viewemp request mapping  
    }  
    /* It provides list of employees in model object */  
    @RequestMapping("/viewCourse")  
    public ModelAndView viewCourse(){  
        List<Course> list=courseService.getAllCourse();  
        return new ModelAndView("viewCourse","list",list);  
    }  
    /* It displays object data into form for the given id.  
     * The @PathVariable puts URL data into variable.*/  
    @RequestMapping(value="/editCourse/{id}")  
    public ModelAndView edit(@PathVariable String id){  
          
        Course course =null;
    	//= courseService.getCourseById(id);
        return new ModelAndView("editCourse","command",course);  
    }  
    /* It updates model object. */  
    @RequestMapping(value="/editsave",method = RequestMethod.POST)  
    public ModelAndView editsave(@ModelAttribute("course") Course course){  
        courseService.updateCourse(course); 
        return new ModelAndView("redirect:/viewCourse");  
    }  
    /* It deletes record for the given id in URL and redirects to /viewemp */  
    @RequestMapping(value="/deleteCourse/{id}",method = RequestMethod.GET)  
    public ModelAndView delete(@PathVariable String id){  
        courseService.deleteCourse(id);
        return new ModelAndView("redirect:/viewCourse");  
    }  


}
