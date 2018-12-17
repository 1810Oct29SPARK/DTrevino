package com.revature.main;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import com.revature.dao.EmployeeDAO;
import com.revature.dao.EmployeeDAOImpl;
import com.revature.util.ConnectionUtil;

public class CompOrthoEmployee {

	

	public static void main(String[] args) {
		
		Connection conn = null;
		
		try {
			conn = ConnectionUtil.getConnection("connection.properties");
			System.out.println("connection is good");
		}
		catch (SQLException | IOException e) {
			e.printStackTrace();
		}
		
		EmployeeDAO ed = new EmployeeDAOImpl(conn);
		
		// TODO Auto-generated method stub

	}
	
	public static String acronym(String string) {
		return string; 
	}
	
	

}
