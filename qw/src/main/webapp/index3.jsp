<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Interest Calculator</h1>
    <form action="" method="post">
        <label for="principal">Principal Amount:</label>
        <input type="number" name="principal" required><br>
        
        <label for="rate">Rate of Interest (%):</label>
        <input type="number" name="rate" required><br>
        
        <label for="time">Time (years):</label>
        <input type="number" name="time" required><br>
        
        <label for="interestType">Interest Type:</label>
        <select name="interestType">
            <option value="simple">Simple Interest</option>
            <option value="compound">Compound Interest</option>
        </select><br>
        
        <input type="submit" value="Calculate">
    </form>

    <%
        double principal = Double.parseDouble(request.getParameter("principal"));
        double rate = Double.parseDouble(request.getParameter("rate"));
        int time = Integer.parseInt(request.getParameter("time"));
        String interestType = request.getParameter("interestType");

        double interest = 0;

        if (interestType.equals("simple")) {
            interest = (principal * rate * time) / 100;
        } else if (interestType.equals("compound")) {
            interest = principal * Math.pow(1 + rate / 100, time) - principal;
        }
    %>

    <h2>Calculation Result:</h2>
    <p><strong>Principal Amount:</strong> <%= principal %></p>
    <p><strong>Rate of Interest:</strong> <%= rate %>%</p>
    <p><strong>Time:</strong> <%= time %> years</p>
    <p><strong>Interest Type:</strong> <%= interestType %></p>
    <p><strong>Interest:</strong> <%= interest %></p>
</body>
</html>