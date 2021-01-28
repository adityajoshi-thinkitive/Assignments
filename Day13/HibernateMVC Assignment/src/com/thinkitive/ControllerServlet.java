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

		int empid, salary;
		String empname;
		try {
			empid = Integer.parseInt(request.getParameter("txtempid"));
			empname = request.getParameter("txtempname"); 
			salary = Integer.parseInt(request.getParameter("txtsalary"));
		}catch (Exception e) {
			empid = 0;
			empname = "";
			salary=0;
		}
	    
		MyDBConnection d=new MyDBConnection(empid, empname, salary);
		ArrayList<Employee> elist = new ArrayList<Employee>();
		String act = request.getParameter("act");
		if (act.equals("Insert")) {
			d.insertEmployee();
			response.sendRedirect("index.jsp");
		} else if (act.equals("Update")) {
			d.updateEmployee();
			response.sendRedirect("index.jsp");
		} else if (act.equals("Delete")) {
			d.deleteEmployee();
			response.sendRedirect("index.jsp");
		} else if (act.equals("Show")) {
			List l = d.showEmployee();
		
			RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
		    request.setAttribute("emplist", l);
			rd.forward(request, response);
		}
		   	    
	}

}
