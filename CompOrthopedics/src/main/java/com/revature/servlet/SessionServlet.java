package com.revature.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.beans.Employee;

@WebServlet("/session")
public class SessionServlet extends HttpServlet {

	private static final long serialVersionUID = -720743516083268190L;
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// grab current session, if it exists
		response.setContentType("application/json");
		HttpSession session = request.getSession(false);
		if (session != null && session.getAttribute("empId") != null) {
			try {
				int empId = Integer.parseInt(session.getAttribute("empId").toString());
				int manId = Integer.parseInt(session.getAttribute("manId").toString());
				String firstname = session.getAttribute("firstname").toString();
				String lastname = session.getAttribute("lastname").toString();
				String title = session.getAttribute("title").toString();
				Employee emp = new Employee(empId, manId, firstname, lastname, title);
				response.getWriter().write((new ObjectMapper()).writeValueAsString(emp));
			} catch (Exception e) {
				e.printStackTrace();
				response.getWriter().write("{\"session\":null}");
			}
		} else {
			response.getWriter().write("{\"session\":null}");
		}
	}

}
