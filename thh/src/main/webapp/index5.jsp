<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <h1>Student Information</h1>
    
    <form method="post" action="">
        <label for="studentName">Student Name:</label>
        <input type="text" id="studentName" name="studentName"><br>
        
        <label for="studentId">Student ID:</label>
        <input type="text" id="studentId" name="studentId"><br>
        
        <label for="studentAge">Student course:</label>
        <input type="text" id="studentcourse" name="studentcourse"><br>
        
        <input type="submit" value="Submit">
    </form>
    
    <br>
    
    <h2>Student Information Table</h2>
    <table border="1">
        <tr>
            <th>Student Name</th>
            <th>Student ID</th>
            <th>Student Age</th>
        </tr>
        <tr>
            <td><%= request.getParameter("studentName") %></td>
            <td><%= request.getParameter("studentId") %></td>
            <td><%= request.getParameter("studentAge") %></td>
        </tr>
    </table>
</body>
</html>