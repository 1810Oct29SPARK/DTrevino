package com.revature.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.revature.beans.Login;
import com.revature.util.ConnectionUtil;

public class LoginDAOImpl implements LoginDAO {
	
	private Connection conn;

	public LoginDAOImpl() {
		super(); 
		try {
			conn = ConnectionUtil.getConnection("connection.properties");
			System.out.println("connection is good");
		}
		catch (SQLException | IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public int login(String username, String pass) throws SQLException {
		
		String sqlStmt = "SELECT EMPID\r\n" + 
				"FROM EMPLOGIN \r\n" + 
				"WHERE USERNAME = ? AND PASS = ?";
		
		PreparedStatement pstmt = this.conn.prepareStatement(sqlStmt);
		pstmt.setString(1, username);
		pstmt.setString(2, pass);
		
		ResultSet rs = pstmt.executeQuery();
		
		if (rs.next()) {
			
			int empID = rs.getInt("EMPID"); 
			System.out.println("This is the empID in LoginDAO"+empID);
			return empID;
		}
		else {
			return 0;
		}
	}

	@Override
	public Login changePass(String username, String pass) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Login changeUser(String username, String pass) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}



}
