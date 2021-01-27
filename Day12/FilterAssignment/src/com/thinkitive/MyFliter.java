package com.thinkitive;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class MyFliter
 */
@WebFilter("/login")
public class MyFliter implements Filter {

    /**
     * Default constructor. 
     */
    public MyFliter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		//ExECUTE before servlet
		PrintWriter out =response.getWriter();
		
		out.println("pre filter......");
		String username = request.getParameter("txtusername");
	    String password = request.getParameter("txtpassword");
	    if(username.length()>=1 || password.length()>=1) {
	    	chain.doFilter(request, response);
	    }else {
	    	out.println("Username and password can't be kept blank <a href='login'>Click here</a>to go back");
	    }
	    
		
		//EXecute after servlet
		out.println("post filter......");
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
