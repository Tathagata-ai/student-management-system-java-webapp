package com.tathagata.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import com.tathagata.model.Student;

public class StudentDAO {
	 private String jdbcURL = "jdbc:mysql://localhost:3306/studentdb";
	 private String jdbcUsername = "root";
	 private String jdbcPassword = "tathagata";
	 
	// DB Connection
	    private Connection getConnection() {
	        Connection connection = null;
	        try {
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        return connection;
	    }
	    
	 // Insert Student
	    public void insertStudent(Student student) {
	        String sql = "INSERT INTO students (name, email, course) VALUES (?, ?, ?)";

	        try (Connection conn = getConnection();
	             PreparedStatement stmt = conn.prepareStatement(sql)) {

	            stmt.setString(1, student.getName());
	            stmt.setString(2, student.getEmail());
	            stmt.setString(3, student.getCourse());

	            stmt.executeUpdate();

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	    
	    // Get All Students
	    public List<Student> getAllStudents() {
	        List<Student> students = new ArrayList<>();
	        String sql = "SELECT * FROM students";

	        try (Connection conn = getConnection();
	             PreparedStatement stmt = conn.prepareStatement(sql);
	             ResultSet rs = stmt.executeQuery()) {

	            while (rs.next()) {
	                Student s = new Student();
	                s.setId(rs.getInt("id"));
	                s.setName(rs.getString("name"));
	                s.setEmail(rs.getString("email"));
	                s.setCourse(rs.getString("course"));
	                students.add(s);
	            }

	        } catch (Exception e) {
	            e.printStackTrace();
	        }

	        return students;
	    }
	    public void deleteStudent(int id) {
	        String sql = "DELETE FROM students WHERE id = ?";

	        try (Connection conn = getConnection();
	             PreparedStatement stmt = conn.prepareStatement(sql)) {

	            stmt.setInt(1, id);
	            stmt.executeUpdate();

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	    
	    public Student getStudentById(int id) {
	        Student student = null;
	        String sql = "SELECT * FROM students WHERE id = ?";

	        try (Connection conn = getConnection();
	             PreparedStatement stmt = conn.prepareStatement(sql)) {

	            stmt.setInt(1, id);
	            ResultSet rs = stmt.executeQuery();

	            if (rs.next()) {
	                student = new Student();
	                student.setId(rs.getInt("id"));
	                student.setName(rs.getString("name"));
	                student.setEmail(rs.getString("email"));
	                student.setCourse(rs.getString("course"));
	            }

	        } catch (Exception e) {
	            e.printStackTrace();
	        }

	        return student;
	    }
	    public void updateStudent(Student student) {
	        String sql = "UPDATE students SET name=?, email=?, course=? WHERE id=?";

	        try (Connection conn = getConnection();
	             PreparedStatement stmt = conn.prepareStatement(sql)) {

	            stmt.setString(1, student.getName());
	            stmt.setString(2, student.getEmail());
	            stmt.setString(3, student.getCourse());
	            stmt.setInt(4, student.getId());

	            stmt.executeUpdate();

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }


}
