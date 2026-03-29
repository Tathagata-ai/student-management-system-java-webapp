<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Management System</title>
<link rel="stylesheet" href="css/style.css">
</head>
<body>

<h2>Add Student</h2>

<form action="addStudent" method="post">
    Name: <input type="text" name="name" required><br><br>
    Email: <input type="email" name="email" required><br><br>
    Course: <input type="text" name="course" required><br><br>

    <input type="submit" value="Add Student">
</form>
<a href="addStudent">View Students</a>
</body>
</html>