package com.Hma.java.serviceImpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Hma.java.service.ProfileService;

public class ProfileServiceImpl implements ProfileService {
	 
		@Override
		public void createPatientProfile(HttpServletRequest req, HttpServletResponse res) {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital", "root", "ROOT");

				PreparedStatement statement = connection
						.prepareStatement("insert into patient (name,age,address,mobile,gender) values (?,?,?,?,?)");
				statement.setString(1, req.getParameter("name"));
				statement.setString(2, req.getParameter("age"));
				statement.setString(3, req.getParameter("address"));
				statement.setString(4, req.getParameter("mobile"));
				statement.setString(5, req.getParameter("gender"));

				int noOfRowsAffected = statement.executeUpdate();
				if (noOfRowsAffected >= 1) {
					res.sendRedirect("Dashboard.html");
				} else {
					System.err.println("something went wrong");
				}
				
				connection.close();
			} catch (Exception e) {
				
				e.printStackTrace();
			}
		}
		@Override
		public void createDoctorProfile(HttpServletRequest req, HttpServletResponse res) {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital", "root", "ROOT");

				PreparedStatement statement = connection.prepareStatement(
						"insert into doctor (name,age,address,mobile,gender,department,experience,availability) values (?,?,?,?,?,?,?,?)");
				statement.setString(1, req.getParameter("name"));
				statement.setString(2, req.getParameter("age"));
				statement.setString(3, req.getParameter("address"));
				statement.setString(4, req.getParameter("mobile"));
				statement.setString(5, req.getParameter("gender"));
				statement.setString(6, req.getParameter("department"));
				statement.setString(7, req.getParameter("experience"));
				boolean availability = req.getParameter("availability") != null;
				statement.setBoolean(8, availability);

				int noOfRowsAffected =  statement.executeUpdate();
				if (noOfRowsAffected >= 1) {
					res.sendRedirect("Dashboard.html");
				} else {
					System.err.println("something went wrong");
				}
				
				connection.close();
			} catch (Exception e) {
			
				e.printStackTrace();
			}
		}
	}


