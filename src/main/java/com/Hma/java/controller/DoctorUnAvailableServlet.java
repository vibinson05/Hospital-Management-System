package com.Hma.java.controller;

import javax.servlet.annotation.WebServlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Hma.java.service.DoctorService;

import com.Hma.java.serviceImpl.DoctorServiceImpl;

@WebServlet("/makeDoctorUnAvailable")

public class DoctorUnAvailableServlet extends HttpServlet {
		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) {
			DoctorService service = new DoctorServiceImpl();
			service.makeDoctorUnAvailable(req, resp);
		}

}

