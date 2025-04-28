package com.Hma.java.controller;

import javax.servlet.annotation.WebServlet;
import com.Hma.java.serviceImpl.AuthenticationServiceImpl;
import com.Hma.java.service.AuthenticationService;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/signup")
public class SignupController  extends HttpServlet {
	
	
		@Override
		public void doPost(HttpServletRequest req, HttpServletResponse resp) {
			AuthenticationService service = new AuthenticationServiceImpl();
			service.signUp(req, resp);
		}
	}


