<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
    <h2>Login</h2>
    <form action="login" method="post">
        <label for="email">Email:</label><br>
        <input type="email" name="email" required><br><br>
        <label for="password">Senha:</label><br>
        <input type="password" name="password" required>
        <br>
        <br>
        <input type="submit" value="Entrar">
    </form>
    <br>
    <a href="user-register.jsp">Cadastrar-se</a>
    <p style="color:red;"><%= request.getAttribute("error") != null ? request.getAttribute("error") : "" %></p>
</body>
</html>
