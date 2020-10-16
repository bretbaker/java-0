package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.services.UserValidationService;

@WebServlet(urlPatterns = "/login.do")
public class LoginServlet extends HttpServlet {
	
	private UserValidationService service = new UserValidationService();

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		req.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(req, res);
	};
	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String name = req.getParameter("name");
		req.setAttribute("name", name);
		String password = req.getParameter("password");
		req.setAttribute("password", password);
		req.getRequestDispatcher("/WEB-INF/views/welcome.jsp").forward(req, res);
	};
}
