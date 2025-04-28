package com.Hma.java.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.Hma.java.service.DoctorService;
import com.Hma.java.serviceImpl.DoctorServiceImpl;

@WebServlet("/makeDoctorAvailable")
public class DoctorAvailableServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("servlet works");
		DoctorService service = new DoctorServiceImpl();
		service.makeDoctorAvailable(req, resp);
	}

}
