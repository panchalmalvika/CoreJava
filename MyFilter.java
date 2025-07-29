package com.filter;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;
import java.io.IOException;


@WebFilter("/MyFilter")
public class MyFilter extends HttpFilter implements Filter {
       
	public void destroy() {
		System.out.println("Filter Destroyed");
	}
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		if(request.getParameter("email").equals("panchal@gmail.com"))
		{
			if(request.getParameter("password").equals("panchal"))
			{
				System.out.println("Login Passed");
				chain.doFilter(request, response);
			}
			else
			{
				request.setAttribute("msg", "Incorrect password");
				request.getRequestDispatcher("Login.jsp").forward(request, response);
			}
		}
		else
		{
			request.setAttribute("msg", "Email Not Registered");
			request.getRequestDispatcher("Login.jsp").forward(request, response);
		}
	}
	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("Filter Intialized");
	}

}
