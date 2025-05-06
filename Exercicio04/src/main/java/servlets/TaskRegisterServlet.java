package servlets;

import DAO.TaskDAO;
import Model.Task;
import Model.User;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet("/register-task")
public class TaskRegisterServlet extends HttpServlet {

    private TaskDAO taskDAO = new TaskDAO();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");

        if (user == null) {
            response.sendRedirect("login.jsp");
            return;
        }

        String description = request.getParameter("description");
        String dateStr = request.getParameter("date");
            
        try {
            Date date = new SimpleDateFormat("yyyy-MM-dd").parse(dateStr);
            Task task = new Task(0, description, date, user);
            taskDao.create(task);

            response.sendRedirect("home.jsp");

        } catch (Exception e) {
            request.setAttribute("error", "Erro ao cadastrar tarefa.");
            request.getRequestDispatcher("task-form.jsp").forward(request, response);
        }
    }
}
