package com.thinkitive;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyClass {

	@Autowired
	Calculator c;

	@RequestMapping(value = "/calculate")
	public ModelAndView calculate(Integer a, Integer b, String act) {

		Integer result = 00;
		System.out.println("Hello");
		try {
		if (act.equals("Addition")) {
			result = c.add(a, b);
		} else if (act.equals("Subtraction")) {
			result = c.sub(a, b);
		} else if (act.equals("Multiplication")) {
			result = c.multiply(a, b);
		} else if (act.equals("Division")) {
			result = c.divide(a, b);
		}
		}catch(NullPointerException e) {
			
		}
		ModelAndView model = new ModelAndView();
		model.setViewName("index.jsp");
		model.addObject("result", result);
		return model;

	}

}
