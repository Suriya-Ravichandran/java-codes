package com.jspider.webapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/second")
public class SecondServlet extends HttpServlet{
	protected void doGet(HttpServletRequest req,HttpServletResponse resp)throws ServletException,IOException{
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		
		Cookie ck1[] =req.getCookies();
		out.print("<h2 style='color:green;'align='center'>Welcome,"+ck1[0].getValue()+"</h2>");
	}
}
