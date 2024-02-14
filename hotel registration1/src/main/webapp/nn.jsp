<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>

<%
   String name = request.getParameter("name");
   String checkInDate = request.getParameter("checkInDate");
   String phoneNumber = request.getParameter("phoneNumber");
   int numberOfDays = Integer.parseInt(request.getParameter("numberOfDays"));
   String address = request.getParameter("address");
   String email = request.getParameter("email");
   String checkOutDate = request.getParameter("checkOutDate");
   String emergencyContact = request.getParameter("emergencyContact");

   // JDBC connection details
   String jdbcUrl = "jdbc:mysql://localhost:3306/hotel_db";
   String dbUser = "your_username";
   String dbPass = "your_password";

   Connection conn = null;
   PreparedStatement pstmt = null;

   try {
       Class.forName("com.mysql.jdbc.Driver");
       conn = DriverManager.getConnection(jdbcUrl, dbUser, dbPass);

       String insertQuery = "INSERT INTO registrations (name, check_in_date, phone_number, number_of_days, address, email, check_out_date, emergency_contact) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
       pstmt = conn.prepareStatement(insertQuery);
       pstmt.setString(1, name);
       pstmt.setString(2, checkInDate);
       pstmt.setString(3, phoneNumber);
       pstmt.setInt(4, numberOfDays);
       pstmt.setString(5, address);
       pstmt.setString(6, email);
       pstmt.setString(7, checkOutDate);
       pstmt.setString(8, emergencyContact);
       pstmt.executeUpdate();

       out.println("Registration successful!");

   } catch (Exception e) {
       out.println("An error occurred: " + e.getMessage());
   } finally {
       if (pstmt != null) {
           pstmt.close();
       }
       if (conn != null) {
           conn.close();
       }
   }
%>
</body>
</html>