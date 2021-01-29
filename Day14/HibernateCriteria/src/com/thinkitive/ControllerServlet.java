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
import java.util.ArrayList;
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

		String empname;
		try {
			empname = request.getParameter("txtempname"); 
		}catch (Exception e) {
			empname = "";
		}
	    
		MyClass d=new MyClass();
		ArrayList<Employee> elist = new ArrayList<Employee>();
		List l = d.getEmp(empname);
		
		RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
	    request.setAttribute("emplist", l);
		rd.forward(request, response);
		   	    
	}

}
