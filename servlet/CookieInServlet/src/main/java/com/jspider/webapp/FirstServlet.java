package com.jspider.webapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/first")
public class FirstServlet extends HttpServlet{
	protected void doGet(HttpServletRequest req,HttpServletResponse resp)throws ServletException,IOException{
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		
		String un=req.getParameter("user");
		String ps=req.getParameter("pass");
		
		if(ps.equals("12345")) {
			Cookie ck = new Cookie("username", un); //key:username & value is un
			resp.addCookie(ck);
			resp.sendRedirect("second");
		}
		
	}
}
