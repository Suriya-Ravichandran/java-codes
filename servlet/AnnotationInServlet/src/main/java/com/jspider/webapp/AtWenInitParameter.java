package com.jspider.webapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(
	urlPatterns="/demo1",
			initParams= {
					@WebInitParam(name="animal",value="tiger"),
					@WebInitParam(name="sport",value="cricket")
			}
)
public class AtWenInitParameter extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)throws ServletException,IOException{
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		
		ServletConfig config=getServletConfig();
		String aname=config.getInitParameter("animal");
		String sname=config.getInitParameter("sport");
		
		out.print("<h2>Animal Name:"+aname+"</h2>");
		out.print("<h2>Sport Name:"+sname+"</h2>");
 }
}	
