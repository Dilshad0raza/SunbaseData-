package com.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/login")
public class loginServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			String log=req.getParameter("log");
			String pass=req.getParameter("pass");
			HttpSession hs=req.getSession();
			if(log.equals("test@sunbasedata.com")&&pass.equals("Test@123")) {
				         resp.sendRedirect("customerdetails.jsp");
			}
			else {
				resp.sendRedirect("index.jsp");
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
