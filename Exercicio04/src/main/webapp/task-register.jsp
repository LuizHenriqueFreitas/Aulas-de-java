<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="Model.User" %>
<%
    User user = (User) session.getAttribute("user");
    if (user == null) {
        response.sendRedirect("login.jsp");
        return;
    }
%>
<html>
<head>
    <title>Cadastro de Tarefa</title>
</head>
<body>
    <h2>Nova Tarefa</h2>
    <form action="register-task" method="post">
        <label>Descrição:</label>
        <input type="text" name="description" required><br><br>
        <input type="submit" value="Cadastrar">
    </form>
    <br>
    <a href="home.jsp">Voltar à Home</a>
    <p style="color:red;"><%= request.getAttribute("error") != null ? request.getAttribute("error") : "" %></p>
</body>
</html>
