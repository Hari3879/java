package com.ojas.model;

public class Users {
public String UserName;
public String PassWord;
public String type;

public Users(){
	
}
public Users(String userName, String passWord, String type) {
	super();
	UserName = userName;
	PassWord = passWord;
	this.type = type;
}

public String getUserName() {
	return UserName;
}
public void setUserName(String userName) {
	UserName = userName;
}
public String getPassWord() {
	return PassWord;
}
public void setPassWord(String passWord) {
	PassWord = passWord;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
@Override
public String toString() {
	return "Users [UserName=" + UserName + ", PassWord=" + PassWord + ", type=" + type + "]";
}


}
