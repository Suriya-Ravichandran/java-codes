package com.jspider.webapp;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DateServlet extends HttpServlet{
	protected void doGet(HttpServletRequest req,HttpServletResponse resp)throws ServletException,IOException{
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		
		Date date=new Date();
		out.print("<h3 style='color:yellow;background-color:green;text-align:center;'>"+date.toString()+"</h3>");
		System.out.println(date);
		resp.setHeader("refresh","1");
	}
}
