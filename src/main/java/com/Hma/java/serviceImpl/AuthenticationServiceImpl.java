package com.Hma.java.serviceImpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Hma.java.service.AuthenticationService;

public class AuthenticationServiceImpl  implements AuthenticationService {

		@Override
		public void signUp(HttpServletRequest req, HttpServletResponse res) {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital", "root", "ROOT");

				PreparedStatement statement = connection
						.prepareStatement("insert into authentication (email,password) values (?,?)");
				String email = req.getParameter("email");
				String password = req.getParameter("password");
				statement.setString(1, email);
				statement.setString(2, password);

				int noOfRowsAffected = statement.executeUpdate();
				if (noOfRowsAffected >= 1) {
					res.sendRedirect("Login.html");
				} else {
					System.err.println("something went wrong");
				}
				
				connection.close();
			} catch (Exception e) {
				
				e.printStackTrace();
			}
		}
		@Override
		public void login(HttpServletRequest req, HttpServletResponse res) {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital", "root", "ROOT");

				PreparedStatement statement = connection
						.prepareStatement("select * from authentication where email =? and password = ?");
				String email = req.getParameter("email");
				String password = req.getParameter("password");
				statement.setString(1, email);
				statement.setString(2, password);

				ResultSet resultSet = statement.executeQuery();
				while (resultSet.next()) {
					HttpSession session = req.getSession();
					
					session.setAttribute("userId", resultSet.getInt("userId"));
					res.sendRedirect("Dashboard.html");
				}
				
				connection.close();
			} catch (Exception e) {
				
				e.printStackTrace();
			}
		}
	}

