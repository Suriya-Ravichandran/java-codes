package com.jspiders.webapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class First_servlet extends HttpServlet  {

	protected void doGet(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException{
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		out.println("Dynamic Web Application \n");
		out.println("Common Term:Combination of static & dynamic web resource \n");
		out.println("Developed by Using Servlet & jsp API's");
	}
}
