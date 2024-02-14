<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Prime Number Checker</h1>
    <form method="post">
        Enter a number: <input type="number" name="number">
        <input type="submit" value="Check">
    </form>

    <%
        int number = 0;
        if (request.getParameter("number") != null) {
            number = Integer.parseInt(request.getParameter("number"));
        }

        boolean isPrime = true;
        if (number <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        String result = isPrime ? "prime" : "not prime";
    %>

    <% if (number != 0) { %>
        <p><%= number %> is <%= result %>.</p>
    <% } %>
</body>
</html>