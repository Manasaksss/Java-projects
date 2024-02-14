import java.io.*;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
@WebServlet("/Secondservlet1")
public class Secondservlet1 extends HttpServlet{
	public void init() {}
	public void service(ServletRequest req,ServletResponse res)
			throws IOException,ServletException{
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		pw.println("---Welcome to Servlet programming--");
		}
	public void destroy() {}
}