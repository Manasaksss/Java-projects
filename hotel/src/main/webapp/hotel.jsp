<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<title>Hotel Management</title>
    <script>
        function bookRoom(roomId) {
            // Perform AJAX request to the server to book the selected room
            // You can use JavaScript frameworks like Axios or jQuery for AJAX

            // Example using XMLHttpRequest
            var xhr = new XMLHttpRequest();
            xhr.open("POST", "/bookRoom", true);
            xhr.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
            xhr.onreadystatechange = function() {
                if (xhr.readyState === XMLHttpRequest.DONE) {
                    if (xhr.status === 200) {
                        alert("Room booked successfully!");
                        // Update UI or perform any other actions
                    } else {
                        alert("Booking failed. Please try again.");
                    }
                }
            };
            xhr.send("roomId=" + roomId);
        }
    </script>
</head>
<body>
    <h1>Welcome to Hotel XYZ</h1>
    <h2>Available Rooms</h2>
    <ul>
        <li>Room 101 <button onclick="bookRoom(101)">Book</button></li>
        <li>Room 102 <button onclick="bookRoom(102)">Book</button></li>
        <!-- Add more room options here -->
    </ul>
</body>
</html>