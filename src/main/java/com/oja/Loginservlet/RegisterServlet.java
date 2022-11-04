package com.oja.Loginservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ojas.model.Users;
import com.ojs.Dao.UserDaoImpl;

public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public RegisterServlet() {
		super();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Eshwar Servelts..");
		PrintWriter out = response.getWriter();
		Users user = new Users();
		user.setUserName(request.getParameter("uname"));

		user.setPassWord(request.getParameter("pwd"));
		user.setType(request.getParameter("type"));
		
		System.out.println(user);
		if (user != null) {
			System.out.println("register success");
		} else {
			System.out.println("check once again");
		}

		UserDaoImpl us = new UserDaoImpl();
		us.register(user);
	}

}
