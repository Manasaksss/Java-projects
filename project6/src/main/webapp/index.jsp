<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="styles.css">
    <title>College Registration</title>
</head>
<body>
    <header>
        <h1>College Registration</h1>
        <a class="button" href="page2.jsp">View Registrations</a>
    </header>
    <main>
        <form>
            <label for="name">Name:</label>
            <input type="text" id="name" name="Name" required>
            
            <label for="address">Address:</label>
            <input type="text" id="address" name="Address" required>
            
            <label for="phone">Phone Number:</label>
            <input type="tel" id="phone" name="Phone_Number" required>
            
            <label for="email">Email:</label>
            <input type="email" id="email" name="Email" required>
            
            <button type="submit">Submit</button>
        </form>
    </main>
</body>
</html>