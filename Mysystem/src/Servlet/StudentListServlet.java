package Servlet;

import conn.MyUtils;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.util.List;

@WebServlet(urlPatterns = {"/studentList"})
    public class StudentListServlet {
        private StudentListServlet() {
            super();
        }

        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            Connection conn = MyUtils.getStoredConnection(request);

            String errorString = null;
            List<Student> list = null;

            request.setAttribute("errorString", errorString);
            request.setAttribute("studentList", list);

            RequestDispatcher dispatcher = request.getServletContext().getRequestDispatcher("/WEB-INF/views/studentListView.jsp");
            dispatcher.forward(request, response);
        }

        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            doGet(request, response);
        }
    }
