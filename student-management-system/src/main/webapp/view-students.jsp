<%@ page import="java.util.List" %>
<%@ page import="com.tathagata.model.Student" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student List</title>
<link rel="stylesheet" href="css/style.css">
</head>
<body>
<div class="container">
    <div class="card">
<div class="container">
    <div class="card">

        <div class="header">
            <h2>Student List</h2>
            <a href="index.jsp"><button>+ Add Student</button></a>
        </div>

  <table>
<tr>
    <th>ID</th>
    <th>Name</th>
    <th>Email</th>
    <th>Course</th>
    <th>Action</th>
</tr>

<%
@SuppressWarnings("unchecked")
List<Student> list = (List<Student>) request.getAttribute("studentList");

for(Student s : list) {
%>
<tr>
    <td><%= s.getId() %></td>
    <td><%= s.getName() %></td>
    <td><%= s.getEmail() %></td>
    <td><%= s.getCourse() %></td>
    <td>
        <td>
    <a href="editStudent?id=<%= s.getId() %>">Edit</a> |
    <a href="deleteStudent?id=<%= s.getId() %>">Delete</a>
</td>
    </td>
</tr>
<%
}
%>

</table>
    </div>
</div>
    </div>
</div>
</body>
</html>