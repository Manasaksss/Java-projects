import java.io.IOException;
import java.io.PrintWriter;

import javax.naming.spi.DirStateFactory.Result;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PalindromeServer
 */
@WebServlet("/PalindromeServer")
public class palindromeServer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public palindromeServer() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");

	      PrintWriter out = response.getWriter();
	      String title = "checking if palindrome";
	      String docType =
	         "<!doctype html public \"-//w3c//dtd html 4.0 " + "transitional//en\">\n";
	      int n,r,sum=0;
	      int num=0;
	     if(request.getParameter("number")!=null) { 
	      num=Integer.parseInt((request.getParameter("number")));
	      n=num;
	      while(n>0) {
	    	  r=n%10;
	    	  sum=(sum*10)+r;
	    	  n=n/10;
	      }
	      String result="not palindrome";
	      if(sum==num) {
	    	  result="given number is a palindrome";
	      }
	      
	      out.println(docType +
	         "<html>\n" +
	            "<head><title>" + title + "</title></head>\n" +
	            "<body bgcolor = \"#f0f0f0\">\n" +
	               "<h1 align = \"center\">" + title + "</h1>\n" +
	               "<ul>\n" +
	                  "  <li><b>number</b>: "
	                  + request.getParameter("number") + "\n" +
	                  "  <li><b>result</b>: "+ result +
	               "</ul>\n" +
	            "</body>" +
	         "</html>"
	      );}
	     else {
	    	  out.println(docType +
	    		         "<html>\n" +
	    		            "<head><title>" + title + "</title></head>\n" +
	    		            "<body bgcolor = \"#f0f0f0\">\n" +
	    		               "<h1 align = \"center\">" + title + "</h1>\n" +
	    		               "<ul>\n" +
	    		                  "  <li><b>enter number in query string</b>: "+
	    		               "</ul>\n" +
	    		            "</body>" +
	    		         "</html>"
	    		      );  
	      }
	     
	   }

	   

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}