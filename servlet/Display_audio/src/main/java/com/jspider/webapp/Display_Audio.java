package com.jspider.webapp;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Display_Audio extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req,HttpServletResponse resp)throws ServletException,IOException{
		resp.setContentType("Audio/mp3");
		ServletOutputStream out=resp.getOutputStream();
		FileInputStream fis=new FileInputStream("C:\\Users\\Suriya Ravichandran\\Downloads\\audio1.mp3");
		BufferedInputStream bis = new BufferedInputStream(fis);
		BufferedOutputStream bout= new BufferedOutputStream(out);
		int ch=0;
		while((ch=bis.read())!=-1){
			bout.write(ch);
		}
		out.close();
		fis.close();
		bis.close();
		bout.close();
	}
}
