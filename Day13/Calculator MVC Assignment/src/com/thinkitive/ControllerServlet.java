package com.thinkitive;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ControllerServlet")
public class ControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public ControllerServlet() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		PrintWriter out  = response.getWriter();
//		out.println("POST: ");
		
		Integer a = Integer.parseInt(request.getParameter("txta"));
		Integer b = Integer.parseInt(request.getParameter("txtb"));  
	    int result = 00;
	    Calculator cl = new Calculator();
	    
	    String act = request.getParameter("act");
		if (act.equals("Addition")) {
			result = cl.add(a, b);
		} else if (act.equals("Subtraction")) {
			result = cl.sub(a, b);
		} else if (act.equals("Multiplication")) {
			result = cl.multiply(a, b);
		} else if (act.equals("Division")) {
			result = cl.divide(a, b);
		} 
	 
	    RequestDispatcher d = request.getRequestDispatcher("index.jsp");
	    request.setAttribute("result", result);
		d.forward(request, response);
	    
	}

}
