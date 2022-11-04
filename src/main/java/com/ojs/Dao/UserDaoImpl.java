package com.ojs.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.ojas.db.DBUtility;
import com.ojas.model.Users;

public class UserDaoImpl implements UserDao {
	public Connection con = DBUtility.getconncetion();
	PreparedStatement ps = null;
	String message = null;
	ResultSet rs = null;
	int effectedRows = 0;

	public String register(Users user) {
		System.out.println("register Eshwar");
		try {
			ps=con.prepareStatement(QuearyInterface.Insert_User);
			ps.setString(1, user.getUserName());
			ps.setString(2, user.getPassWord());
			ps.setString(3, user.getType());
			effectedRows = ps.executeUpdate();
			System.out.println(effectedRows);
			if(effectedRows!=0) {
				message = "success";
			}else {
				message = "failed";
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return message;
	}

	public String login(String userName, String passWord) {

		return null;
	}

	public String forgot(String userName, String type) {
		// TODO Auto-generated method stub
		return null;
	}

}
