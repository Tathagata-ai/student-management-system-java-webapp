# 🚀 Student Management System (Java Web App)

A full-stack **Java web application** built using JSP, Servlets, JDBC, and MySQL that performs complete **CRUD operations**.

---

## 📌 Features

* ➕ Add Student
* 📋 View Students
* ✏️ Update Student Details
* ❌ Delete Student

---

## 🧱 Tech Stack

* **Java (JDK 8+)**
* **JSP & Servlets**
* **JDBC**
* **MySQL**
* **Apache Tomcat**
* **Maven**

---

## 🏗️ Architecture

This project follows **MVC architecture**:

* **Model** → `Student.java`
* **DAO Layer** → Handles DB operations
* **Controller** → Servlets
* **View** → JSP pages

---

## 📂 Project Structure

```
src/
 └── main/
      ├── java/
      │    └── com.tathagata/
      │         ├── model/
      │         ├── dao/
      │         └── servlet/
      └── webapp/
           ├── index.jsp
           ├── view-students.jsp
           ├── edit-student.jsp
           └── css/
```

---

## ⚙️ Setup Instructions

1. Clone the repository:

```
git clone https://github.com/Tathagata-ai/student-management-system-java-webapp.git
```

2. Import into Eclipse as **Maven Project**

3. Configure MySQL database:

```sql
CREATE DATABASE studentdb;

CREATE TABLE students (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100),
    email VARCHAR(100),
    course VARCHAR(100)
);
```

4. Update DB credentials in:

```
StudentDAO.java
```

5. Run on Apache Tomcat

---

## 🌐 Application Flow

* Add Student → Stored in DB
* View Students → Fetch from DB
* Edit → Update data
* Delete → Remove record

---

## 📸 Screenshots (Optional)

### ➕ Add Student
![Add Student](add-student.png)

### 📋 Student List
![Student List](student-list.png)

---

## 💡 Learning Outcomes

* MVC architecture implementation
* JDBC integration with MySQL
* Servlet-based request handling
* Dynamic JSP rendering
* Full CRUD operations

---

## 🚀 Future Improvements

* Add search functionality
* Improve UI with Bootstrap
* Add validation
* Use Hibernate / Spring Boot

---

## 👨‍💻 Author

**Tathagata AI**
🔗 https://github.com/Tathagata-ai
