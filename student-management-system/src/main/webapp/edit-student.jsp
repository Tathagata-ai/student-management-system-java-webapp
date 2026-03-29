<%@ page import="com.tathagata.model.Student" %>

<%
Student student = (Student) request.getAttribute("student");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit Student</title>
<link rel="stylesheet" href="css/style.css">
</head>
<body>

<h2>Edit Student</h2>

<form action="updateStudent" method="post">

    <input type="hidden" name="id" value="<%= student.getId() %>">

    Name: <input type="text" name="name" value="<%= student.getName() %>" required><br><br>

    Email: <input type="email" name="email" value="<%= student.getEmail() %>" required><br><br>

    Course: <input type="text" name="course" value="<%= student.getCourse() %>" required><br><br>

    <input type="submit" value="Update Student">

</form>

<br>
<a href="addStudent">Back to List</a>

</body>
</html>