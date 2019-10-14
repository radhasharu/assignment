package com.slksoft.web.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.slksoft.entity.User;
import com.slksoft.service.UsersService;

@WebServlet("/dashboard")
public class DashboardServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String phone = req.getParameter("phone");
		String city = req.getParameter("city");
		String country = req.getParameter("country");
		String state = req.getParameter("state");
		String email = req.getParameter("email");

		UsersService service = new UsersService();

		User u=service.updateDetails(phone, city, country, state, email);

		req.setAttribute("user", u);
		req.getRequestDispatcher("WEB-INF/views/dashboard.jsp").forward(req, resp);

	}
}
