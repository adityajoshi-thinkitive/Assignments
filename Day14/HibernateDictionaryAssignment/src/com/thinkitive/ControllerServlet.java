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

		String word, meaning;
//		try {
			word = request.getParameter("txtword");
			meaning = request.getParameter("txtmeaning"); 
//		}catch (Exception e) {
//			word= "";
//			meaning = "";
//		}
	    
		MyDBConnection d=new MyDBConnection(word, meaning);
		ArrayList<Dictionary> elist = new ArrayList<Dictionary>();
		String act = request.getParameter("act");
		if (act.equals("Add Word")) {
			d.addWord();
			response.sendRedirect("index.jsp");
		} else if (act.equals("Search Word")) {
			List l = d.searchWord();
			RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
		    request.setAttribute("dict", l);
			rd.forward(request, response);
		} else if (act.equals("Display All")) {
			List l = d.showDictionary();
			RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
		    request.setAttribute("dict", l);
			rd.forward(request, response);
		} 
		   	    
	}

}
