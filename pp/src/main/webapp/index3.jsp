<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Check if a Number is a Multiple</h1>
    <form action="" method="post">
        Enter the number: <input type="number" name="inputNumber" required><br>
        Enter the divisor: <input type="number" name="divisor" required><br>
        <input type="submit" value="Check">
    </form>

    <%
        if (request.getMethod().equals("POST")) {
            int inputNumber = Integer.parseInt(request.getParameter("inputNumber"));
            int divisor = Integer.parseInt(request.getParameter("divisor"));

            if (inputNumber % divisor == 0) {
    %>
                <p><%= inputNumber %> is a multiple of <%= divisor %>.</p>
    <%
            } else {
    %>
                <p><%= inputNumber %> is not a multiple of <%= divisor %>.</p>
    <%
            }
        }
    %>
</body>
</html>