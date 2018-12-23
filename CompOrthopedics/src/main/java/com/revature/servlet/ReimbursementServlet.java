package com.revature.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.revature.service.AuthenticationService;

@WebServlet("/reimbursement")
public class ReimbursementServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 742654176099996938L;
	AuthenticationService authService = new AuthenticationService();

	//return Login page for GET request
	//handle POST request from form on Login page
	//(or anywhere else)
    @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Check whether as session exists for the incoming request
		HttpSession session = request.getSession(false);
		if (session != null && session.getAttribute("empId") != null) {
			request.getRequestDispatcher("reimbursement.html").forward(request, response);
		} else {
			response.sendRedirect("login");
		}
	}

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//view attributes of request
		Enumeration<String> atts = request.getAttributeNames();
		while(atts.hasMoreElements()) {
			String s = atts.nextElement();
			System.out.println(s + " : " + request.getAttribute(s));
		}
		String error = (String) request.getAttribute("error");
		
		//get printWriter
		PrintWriter pw = response.getWriter();
		
		if (error == null || error.equals((""))) {
			//careful!!! 
			try {
				Double answer = (Double) request.getAttribute("answer");
				pw.write("<p style= \"margin:30px\"> The answer is: "+ request.getAttribute("answer") + "</p>");
			} catch (Exception e) {
				pw.write("<p style= \"margin:30px\"> Error: invalid value</p>");
			}
		} else {
			pw.write("<p style= \"margin:30px\"> Error: "+ error + "</p>");
		}
		pw.write("<p style= \"margin:30px\"><a href=\"calculator\">GO BACK</a></p>");
	}
}
