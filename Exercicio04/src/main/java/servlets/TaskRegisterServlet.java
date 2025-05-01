package servlets;

import DAO.TaskDAO;
import Model.Task;
import Model.User;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet("/register-task")
public class TaskRegisterServlet extends HttpServlet {

    private TaskDAO taskDAO = new TaskDAO();

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");

        if (user == null) {
            response.sendRedirect("login.jsp");
            return;
        }

        String description = request.getParameter("description");

        Task task = new Task();
        task.setDescription(description);
        task.setUserId(user.getId());

        boolean success = taskDAO.insertTask(task);

        if (success) {
            response.sendRedirect("home.jsp");
        } else {
            request.setAttribute("error", "Erro ao cadastrar tarefa.");
            request.getRequestDispatcher("task-register.jsp").forward(request, response);
        }
    }
}

