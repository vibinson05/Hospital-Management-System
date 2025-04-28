package com.Hma.java.serviceImpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.Hma.java.service.DoctorService;

public class DoctorServiceImpl implements DoctorService{
		
		@Override
		public void makeDoctorAvailable(HttpServletRequest req, HttpServletResponse res) {
			
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital", "root", "ROOT");
				PreparedStatement statement = connection.prepareStatement("update doctor set availability = true where doctorId = ?");

				String id = req.getParameter("id");
				statement.setInt(1, Integer.parseInt(id));

				int noOfRowsAffected = statement.executeUpdate();
				if (noOfRowsAffected >= 1) {
					res.sendRedirect("AllDoctor.jsp");
				} else {
					System.err.println("something went wrong");
				}
				
				connection.close();
			} catch (Exception e) {
				
				e.printStackTrace();
			}
		}
		@Override
		public void makeDoctorUnAvailable(HttpServletRequest req, HttpServletResponse res) {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital", "root", "ROOT");

				PreparedStatement statement = connection
						.prepareStatement("update doctor set availability = false where doctorId = ?");
				String id = req.getParameter("id");
				statement.setInt(1, Integer.parseInt(id));

				int noOfRowsAffected = statement.executeUpdate();
				if (noOfRowsAffected >= 1) {
					res.sendRedirect("AllDoctor.jsp");
				} else {
					System.err.println("something went wrong");
				}
				
				connection.close();
			} catch (Exception e) {
				
				e.printStackTrace();
			}
		}
	}




