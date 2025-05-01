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
    <title>Home</title>
</head>
<body>
    <h2>Bem-vindo, <%= user.getUsername() %>!</h2>
    <p>Você está logado.</p>
    <a href="task-register.jsp">Cadastrar nova tarefa</a>
</body>
</html>
