package com.thinkitive.SpringMVCDictionary.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.thinkitive.dao.MyDataAccessObject;
import com.thinkitive.model.Dictionary;


@Controller
public class HomeController {

//	@Autowired
//	MyDataAccessObject m;
//	
//	@Autowired
//	Dictionary d;
//	
	@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		return new ModelAndView("home");
	}
	
	@RequestMapping(value = "/dict", method = RequestMethod.POST)
	public ModelAndView dbInsert(String word, String meaning, String act) {
		ModelAndView model = new ModelAndView();
		MyDataAccessObject m = new MyDataAccessObject();
		//model.addObject("message", "Employee added successfully");
		
		if (act.equals("Add Word")) {
			System.out.println("In add word");
			Dictionary d = new Dictionary(word, meaning);
			d.setWord(word);
			d.setMeaning(meaning);
			System.out.println(d);
			m.addWord(d);
			
		} else if (act.equals("Search Word")) {
			List l = m.searchWord(word);
			model.addObject("records", l);
		} else if (act.equals("Display All")) {
			List l = m.showDictionary();
			model.addObject("records", l);
		} 
		
		model.setViewName("index.jsp");
		
		return model;
	}
	
}
