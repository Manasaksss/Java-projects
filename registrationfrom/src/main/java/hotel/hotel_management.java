package hotel;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class hotel_management
 */
@WebServlet("/hotel_management")
public class hotel_management extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/registration","root","Manasa@123");
			String name=request.getParameter("txtName");
			String DateofCheckin=request.getParameter("txtDate of Check-in");
			String phoneNumber=request.getParameter("txtPhone Number");
			String NumberofDays=request.getParameter("txtNumber of Days");
			String Address=request.getParameter("txtAddress");
			String DateofCheckout=request.getParameter("txtDate of Check-out");
			String Email=request.getParameter("txtEmail");
			String EmergencyContact=request.getParameter("txtEmergency Contact");
			PreparedStatement ps=con.prepareStatement("INSERT INTO hotel_management (Name ,Date_of_Check_in ,Phone_Number ,Number_of_Days ,Address ,Email ,Date_of_Check_out ,Emergency_Contact) VALUES(?, ?, ?, ?, ?, ?, ?, ?)");
			ps.setString(1, name);
			ps.setString(1,DateofCheckin );
			ps.setString(1,phoneNumber);
			ps.setString(1, NumberofDays);
			ps.setString(1, Address);
			ps.setString(1, DateofCheckout);
			ps.setString(1, Email);
			ps.setString(1, EmergencyContact);
			int rowsInserted = ps.executeUpdate();
			if(rowsInserted > 0) {
				out.println("<script>alert('Data inserted successfully!');</script>");
			}else {
				
				out.println("<script>alert('Data insertion failed!');</script>");
			}
			ps.close();
			con.close();
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
