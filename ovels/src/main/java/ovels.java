import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/ovels")
public class ovels extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
 String input = request.getParameter("input");
   String output = "h";
   if("hai". equals(input)) {
	response.getWriter().write(output);
   }
   else {
	   response.getWriter().write("hellow");
   }
   }
   }
 
