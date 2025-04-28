package com.Hma.java.controller;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.Hma.java.serviceImpl.AuthenticationServiceImpl;
import com.Hma.java.service.AuthenticationService;

@WebServlet("/login")
public class LoginController extends HttpServlet {
	
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			AuthenticationService service = new AuthenticationServiceImpl();
			service.login(req, resp);
		}

}
