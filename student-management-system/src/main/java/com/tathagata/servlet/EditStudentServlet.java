package com.tathagata.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tathagata.dao.StudentDAO;
import com.tathagata.model.Student;

@WebServlet("/editStudent")
public class EditStudentServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;
    private StudentDAO studentDAO;

    public void init() {
        studentDAO = new StudentDAO();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int id = Integer.parseInt(request.getParameter("id"));

        Student student = studentDAO.getStudentById(id);

        request.setAttribute("student", student);

        request.getRequestDispatcher("edit-student.jsp").forward(request, response);
    }
}
