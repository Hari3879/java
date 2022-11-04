package com.ojs.Dao;

public interface QuearyInterface {
	public static String Insert_User="INSERT INTO users(UserName, PassWord, type) VALUES (?,?,?)"; 
	public static String GET_USER="select User from Users where UserName=? and where PassWord=?";

}
