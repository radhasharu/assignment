package com.slksoft.web.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.slksoft.entity.User;
import com.slksoft.service.UsersService;

@WebServlet("/login")
public class LoginServlet  extends HttpServlet{

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		req.getRequestDispatcher("WEB-INF/views/login-form.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String email=req.getParameter("email");
		
		String password=req.getParameter("password");
		
	
		
		UsersService service = new UsersService();
		
		User u=service.loginUser(email,password);
		
		

		req.setAttribute("user", u);
		
		req.getRequestDispatcher("/WEB-INF/views/dashboard.jsp").forward(req, resp);
		

	
		

	}

}
