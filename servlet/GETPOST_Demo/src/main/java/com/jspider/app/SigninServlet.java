package com.jspider.app;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SigninServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req,HttpServletResponse resp)throws ServletException, IOException{
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		
		String mail_id=(String)req.getParameter("email");
		String mail_pass=(String)req.getParameter("pass");
		
		if(mail_id.equals("abc@gmail.com") && mail_pass.equals("abc@123")) {
			out.print("<h3 style='color:red;'align='center'>Sign in Done</h3>");
		}
		else {
			out.print("<h3 style='color:red;'align='center'>Sign in fail</h3>");
		}
	}
}
