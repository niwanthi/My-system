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

@WebServlet(urlPatterns = {"/doCreateStudent"})
public class DoCreateStudentServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public DoCreateStudentServlet() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Connection conn = MyUtils.getStoredConnection(request);

        String stu_Id = (String) request.getParameter("stu_id");
        String stu_Name = (String) request.getParameter("stu_name");
        String stu_Add = (String) request.getParameter("stu_add");
        String stu_Email = (String) request.getParameter("stu_email");
        int stu_Tel = Integer.parseInt(request.getParameter("stu_tel"));
        float stu_Dob = Float.parseFloat(request.getParameter("stu_dob"));
        int stu_Age = Integer.parseInt(request.getParameter("stu_age"));
        String stu_Gender =(String) request.getParameter("stu_gender");
        String stu_Nat = (String) request.getParameter("stu_nat");
        String stu_Rel = (String) request.getParameter("stu_rel");

        Student student = new Student(stu_Id, stu_Name, stu_Add, stu_Email, stu_Tel, stu_Dob, stu_Age, stu_Gender, stu_Nat, stu_Rel);
       String errorString = null;

       String regex = "\\w+";

       if (stu_Id == null || !stu_Id.matches(regex)) {
           errorString = "Invalid Student ID";
       }

       if (errorString == null) {
           try {
               DBUtils.insertStudent(conn, student);
           } catch (SQLException e) {
               e.printStackTrace();
               errorString = e.getMessage();
           }
       }

        // Store infomation to request attribute, before forward to views.
        request.setAttribute("errorString", errorString);
        request.setAttribute("student", student);

        // If error, forward to Edit page.
        if(errorString != null) {
            RequestDispatcher dispatcher = request.getServletContext().getRequestDispatcher("/WEB-INF/views/createStudentView.jsp");
            dispatcher.forward(request, response);
        }

        else {
            response.sendRedirect(request.getContextPath() + "/studentList");
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
