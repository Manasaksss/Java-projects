package mansa;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
@WebServlet("/ArmstrongServlet")
public class ArmstrongServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        int number = Integer.parseInt(request.getParameter("number"));
        int originalNumber = number;
        int sum = 0;

        int numDigits = (int) Math.log10(number) + 1;

        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, numDigits);
            number /= 10;
        }

        if (sum == originalNumber) {
            out.println("<h2>" + originalNumber + " is an Armstrong number!</h2>");
        } else {
            out.println("<h2>" + originalNumber + " is not an Armstrong number.</h2>");
        }

        out.close();
    }
}

