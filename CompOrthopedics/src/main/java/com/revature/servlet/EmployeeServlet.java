package com.revature.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/employee")
public class EmployeeServlet extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7603432772281800290L;

	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Check whether as session exists for the incoming request
		System.out.println("this is being redirected");

		HttpSession session = request.getSession(false);
		if (session != null && session.getAttribute("empId") != null) {
			System.out.println("this calls the employee html");
			request.getRequestDispatcher("employee.html").forward(request, response);
		} else {
			response.sendRedirect("login");
		}
	}

}

