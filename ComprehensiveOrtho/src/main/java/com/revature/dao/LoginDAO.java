package com.revature.dao;

import java.sql.SQLException;

import com.revature.beans.Login;

public interface LoginDAO {
	
	boolean login(String username, String pass) throws SQLException; 
	Login changePass(String username, String pass) throws SQLException; 
	Login changeUser(String username, String pass) throws SQLException; 

}
