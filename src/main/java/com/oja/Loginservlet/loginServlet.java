package com.oja.Loginservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ojas.model.Users;
import com.ojs.Dao.UserDaoImpl;

/**
 * Servlet implementation class loginServlet
 */
public class loginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public loginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	/**
	
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response, String UserName, String PassWord) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		UserDaoImpl dao = new UserDaoImpl();
		Users user = new Users();
		user.setUserName(request.getParameter("uname"));
		user.setPassWord(request.getParameter("pwd"));
		String type = dao.login(user.getUserName(), user.getPassWord());
		if(type.equals("admin")) {
			out.println("<center><h1>WELCOME TO ADMIN HOME PAGE</h1></center>");
		}else if(type.equals("user")) {
			out.println("<center><h1>WELCOME TO USERS HOME PAGE</h1></center>");
		}else {
			out.println("<h5 style=color:red>Invalid Username/Password.Please try again</h5>");
			RequestDispatcher rd = request.getRequestDispatcher("./login.jsp");
			rd.include(request, response);
		}
	}

}
