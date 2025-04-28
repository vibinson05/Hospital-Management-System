package com.Hma.java.controller;

import java.io.IOException;
import com.Hma.java.serviceImpl.ProfileServiceImpl;
import com.Hma.java.service.ProfileService;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/createDoctorProfile")
public class DoctorProfileController extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ProfileService service = new ProfileServiceImpl();
		service.createDoctorProfile(req, resp);
	}

}
