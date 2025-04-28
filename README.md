## Hospital Management System

A dynamic, database-driven web application to manage hospital operations including doctor and patient profile management, appointment booking, and medical history tracking. Built using JSP/Servlets, MySQL, and deployed on Tomcat 9.0.

## Features

1. Doctor and Patient Management
  * Create, update, and manage doctor and patient profiles, including essential details like contact information, medical history, and department.

2. Appointment Booking
   * Patients can book appointments with available doctors, specifying preferred date and time.

3. Real-Time Doctor Availability
   * Admins can toggle doctor availability, and patients can book appointments only with available doctors.

4. Patient History
   * View detailed patient history with past appointments, doctors, departments, payment details, and statuses.

5. Secure Login
   * Admin and user authentication, ensuring authorized access only, with session management.

6. Responsive UI
   * A user-friendly and responsive interface built with HTML and CSS for enhanced accessibility and mobile-friendly design.

## Technologies

1. Backend: Java (JSP/Servlets), JDBC
2. Frontend: HTML, CSS, Bootstrap
3. Database: MySQL
4. Server: Apache Tomcat 9.0

## Setup

1. Prerequisites
  * Java 8 or higher
  * MySQL 5.7 or higher
  * Apache Tomcat 9.0
  * IDE (e.g., IntelliJ IDEA, Eclipse)

## Installation

!. Clone the repository:
   * git clone https://github.com/your-username/hospital-management-system.git
   
2. Setup Database:
  * Create a database named hospital in MySQL.
  * Run the provided SQL scripts to create the necessary tables for doctors, patients, and appointments.
  * Configure the Database Connection:
  * Modify the db.properties file (or similar) to set the database credentials and connection URL.

3. Deploy on Tomcat:
  * Import the project into your IDE or deploy the WAR file to Tomcat 9.0.

4. Run the Application:
  * Start Tomcat and access the application at http://localhost:8080/hospital-management-system.

Usage
Admin Dashboard: Access and manage doctor and patient profiles, mark doctors as available/unavailable, and view patient histories.

Patient View: Patients can book appointments, check history, and view doctor availability.

Doctor View: Doctors can update their availability and manage their appointments.
