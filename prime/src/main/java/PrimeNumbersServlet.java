import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
@WebServlet("/primeNumberServlet")
public class PrimeNumbersServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        int input = Integer.parseInt(request.getParameter("input"));

        out.println("<html><body>");
        out.println("Prime numbers up to " + input + ":<br>");

        for (int i = 3; i <= input; i++) {
            if (isPrime(i)) {
                out.println(i + "<br>");
            }
		}
        out.println("</body></html>");
        out.close();
    }
    

    private boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}