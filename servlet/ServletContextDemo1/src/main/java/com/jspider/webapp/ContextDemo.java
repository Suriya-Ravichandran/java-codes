package com.jspider.webapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ContextDemo extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req,HttpServletResponse resp)throws ServletException,IOException{
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		ServletContext context=req.getServletContext();
		String name= context.getInitParameter("movie");
		String hero_name= context.getInitParameter("hero");
		String heroine_name= context.getInitParameter("heroine");
		
		out.println("<h3 style='color:ocean-blue;' align='center'>Movie name: "+name+"</h3>");
		out.println("<h3 style='color:ocean-blue;' align='center'>Movie hero: "+hero_name+"</h3>");
		out.println("<h3 style='color:ocean-blue;' align='center'>Movie heroine: "+heroine_name+"</h3>");
		
	}

}
