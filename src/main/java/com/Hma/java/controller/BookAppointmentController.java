package com.Hma.java.controller;

import java.io.IOException;
import com.Hma.java.serviceImpl.AppointmentServiceImpl;
import com.Hma.java.service.AppointmentService;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/bookAppointment")
public class BookAppointmentController extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Servlet works");
		AppointmentService service = new AppointmentServiceImpl();
		service.bookAppointment(req, resp);
	}

}
