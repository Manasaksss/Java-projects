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
@WebServlet("/hotel_management1")
public class hotel_management1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/registration","root","Manasa@123");
			String name=request.getParameter("name");
			String DateofCheckin=request.getParameter("check_in_date");
			String phoneNumber=request.getParameter("phone");
			String NumberofDays=request.getParameter("Number_of_Days");
			String Address=request.getParameter("address");
			String Email=request.getParameter("email");
			String DateofCheckout=request.getParameter("check_out_date");
			String EmergencyContact=request.getParameter("emergency_contact");
			PreparedStatement ps=con.prepareStatement("INSERT INTO hotel_management1(Name ,check_in_date ,Phone_Number ,Number_of_Days ,Address ,Email ,Date_of_Check_out ,Emergency_Contact) VALUES(?, ?, ?, ?, ?, ?, ?, ?)");
			ps.setString(1,name);
			ps.setString(2,DateofCheckin );
			ps.setString(3,phoneNumber);
			ps.setString(4,NumberofDays);
			ps.setString(5,Address);
			ps.setString(6,Email);
			ps.setString(7,DateofCheckout);
			ps.setString(8,EmergencyContact);
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
