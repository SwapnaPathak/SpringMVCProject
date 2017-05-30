package com.org.wipro.controller
;

import java.io.FileReader;

import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;
import com.org.wipro.bean.UniversityBean;
import com.org.wipro.model.University;
import com.org.wipro.service.UniversityService;

@Controller
public class UniversityController {
    @Autowired    
    private UniversityService universityService;
    
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView loadFirstPage() {
	    
     return new ModelAndView("index")  ;
     }
	
	@RequestMapping(value = "/universityList", method = RequestMethod.GET)
	public ModelAndView saveUniversityList(ModelMap map) {
	 /*University[] university = getUniversityList();
	  for(University i :university)
	  {
      universityService.addUniversity(i);
	  }*/
	  List<University> universityList=universityService.listUniversity();
	  map.addAttribute("univerSityObj", universityList);
	   
     return new ModelAndView("universityList", map);
	 }

	 private University[] getUniversityList() {
		// TODO Auto-generated method stub
		 Gson gson = new Gson();
		    University list[] = null;

		    try (Reader reader = new FileReader("E:/universities.json")) {

				// Convert JSON to Java Object
		        list = gson.fromJson(reader, University[].class);
		       
		       } catch (IOException e) {
		        e.printStackTrace();
		    }
		return list;
	}

	@RequestMapping(value="/getuniversityList", method = RequestMethod.GET)
	 public ModelAndView listUniversity() {
	  Map<String,Object> model = new HashMap<String, Object>();
	  List<University> university=universityService.listUniversity();
	  System.out.println("university list " + university.size());
	  
	  	  return new ModelAndView("universityList", "univerSityObj",university);
	 }



}
