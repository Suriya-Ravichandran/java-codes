package getuserdata;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GetData extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException {
		resp.setContentType("text/html");
		PrintWriter out =resp.getWriter();	
		
		String name=(String)req.getParameter("name");
		String age=(String)req.getParameter("age");
		
		out.print("name: "+name);
		out.print("age: "+ age);
		
		}

}
