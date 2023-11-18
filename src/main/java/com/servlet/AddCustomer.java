package com.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.DB.dbConnect;
import com.Dao.AddDetails;
import com.Entity.sunEntity;
@WebServlet("/add")
public class AddCustomer extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			String fn=req.getParameter("fn");
			String ln=req.getParameter("ln");
			String street=req.getParameter("st");
			String add=req.getParameter("ad");
			String city=req.getParameter("ci");
			String state=req.getParameter("sta");
			String email=req.getParameter("em");
			String phone=req.getParameter("ph");
			sunEntity s=new sunEntity(fn,ln,add,street,city,state,email,phone);
			AddDetails ad=new AddDetails(dbConnect.getcon());
			boolean b=ad.insertDetails(s);
			if(b) {
				resp.sendRedirect("customerdetails.jsp");
			}
			else {
				resp.sendRedirect("addcustomer.jsp");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
