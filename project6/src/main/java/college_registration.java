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
 * Servlet implementation class college
 */
@WebServlet("/college_registration")
public class college_registration extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/2registration","root","Manasa@123");
			String name=request.getParameter("name");
			String Address=request.getParameter("address");
			String phoneNumber=request.getParameter("phone");
			String Email=request.getParameter("email");
			PreparedStatement ps=con.prepareStatement("INSERT INTO college_registration(Name ,Address,Phone_Number,Email ) VALUES(?, ?, ?, ?)");
			ps.setString(1,name);
			ps.setString(2,Address);
			ps.setString(3,phoneNumber);
			ps.setString(4,Email);
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
