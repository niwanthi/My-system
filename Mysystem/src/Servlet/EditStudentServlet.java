package Servlet;

import conn.DBUtils;
import conn.MyUtils;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

@WebServlet(urlPatterns = {"/editProduct"})
public class EditStudentServlet extends HttpServlet {
    private  static final long serialVersionUID = 1L;

    public EditStudentServlet() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Connection conn = MyUtils.getStoredConnection(request);

        String stu_Id = (String) request.getParameter("stu _id");

        Student student =  null;

        String errorString = null;

        try {
            student = DBUtils.findStudent(conn, stu_Id);
        } catch (SQLException e) {
            e.printStackTrace();
            errorString = e.getMessage();
        }

        if(errorString != null && student == null) {
            response.sendRedirect(request.getServletPath() + "/studentList");
            return;
        }

        request.setAttribute("errorString", errorString);
        request.setAttribute("student", student);

        RequestDispatcher dispatcher = request.getServletContext().getRequestDispatcher("/WEB-INF/views/editStudentView.jsp");
        dispatcher.forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
