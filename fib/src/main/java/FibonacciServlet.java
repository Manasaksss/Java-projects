import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
@WebServlet("/FibonacciServlet")
public class FibonacciServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        int n = Integer.parseInt(request.getParameter("digits"));
        if (n <= 0) {
            out.println("Please provide a positive number of digits.");
            return;
        }

        out.println("<html><head><title>Fibonacci Series</title></head><body>");
        out.println("<h2>Fibonacci Series up to " + n + " digits:</h2>");

        long prev = 0;
        long current = 1;
        out.println(prev + "<br>");
        out.println(current + "<br>");

        while (current <= Math.pow(10, n - 1)) {
            long next = prev + current;
            out.println(next + "<br>");
            prev = current;
            current = next;
        }

        out.println("</body></html>");
        out.close();
    }
}