package com.revature.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.revature.beans.Login;
import com.revature.beans.Employee;
import com.revature.service.AuthenticationService;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 742654176099996938L;
	AuthenticationService authService = new AuthenticationService();

	//return Login page for GET request
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		req.getRequestDispatcher("login.html").forward(req, resp);
	}
	
	//handle POST request from form on Login page
	//(or anywhere else)
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("handling request...");
		// checks whether a session exists, otherwise creates a new one. 
		// overloaded version takes a boolean create param, if false it returns 
		// null if no session exists for the current request. 
		HttpSession session = req.getSession(); 
		resp.setContentType("text/html");
		//grab params from request 
		Login cred = new Login(req.getParameter("username"),req.getParameter("password"));
		//attempt to authenticate the user
		Employee emp = authService.isValidUser(cred);
		//set user information as session attributes
		if (emp != null) {
			session.setAttribute("empId", emp.getId());
			session.setAttribute("manId", emp.getManId());
			session.setAttribute("firstname", emp.getFirstName());
			session.setAttribute("lastname", emp.getLastName());
			session.setAttribute("title", emp.getTitle());
			session.setAttribute("problem", null);
			//redirect user to profile page if authenticated
			
			if(emp.getManId()>=100) {
				resp.sendRedirect("admin");
			}
			
			else {
			resp.sendRedirect("employee");
			}
			System.out.println("profile page is authenticated");
		} else {
			session.setAttribute("problem", "invalid credentials");
			System.out.println("profile page is not authenticated");
			//redirect user to login page if authentication fails
			resp.sendRedirect("login");
		}
	}
}
