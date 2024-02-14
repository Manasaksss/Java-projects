import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Findsq")
public class Findsq extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Findsq() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
PrintWriter out = response.getWriter();
        
        String numberStr = request.getParameter("number"); //input from query string
        
        if (numberStr == null || numberStr.isEmpty()) {
            out.println("<h2>Please provide a number parameter in the URL.</h2>");
            return;
        }
        
        try {
            int number = Integer.parseInt(numberStr);
            boolean isPerfectSquare = isPerfectSquare(number);
            
            out.println("<h2>Number: " + number + "</h2>");
            if (isPerfectSquare) {
                out.println("<p>This is a perfect square.</p>");
            } else {
                out.println("<p>This is not a perfect square.</p>");
            }
        } catch (NumberFormatException e) {
            out.println("<h2>Invalid number format.</h2>");
        }
    }
    
    // Function to check if a number is a perfect square
    private boolean isPerfectSquare(int num) {
        int sqrt = (int) Math.sqrt(num);
        return sqrt * sqrt == num;
    }






	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}