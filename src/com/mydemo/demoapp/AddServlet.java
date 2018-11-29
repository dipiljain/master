package com.mydemo.demoapp;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest req, HttpServletResponse res) {
		
			int i = Integer.parseInt(req.getParameter("num1"));
			int j = Integer.parseInt(req.getParameter("num2"));
			
			int result = i+j;
			System.out.println("Sum is "+result);
			
			try {
				res.getWriter().println("Sum is "+result);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			};
			
	}
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		
		int result = i+j;
		System.out.println("Sum is "+result);
		
		try {
			res.getWriter().println("Sum is "+result);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};
		
		RequestDispatcher rd = req.getRequestDispatcher("sq");
		req.setAttribute("sum", result);
		rd.forward(req, res);
		
}
}
