<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Cadastro de Usuário</title>
</head>
<body>
    <h2>Cadastro de Usuário</h2>
    <form action="register-user" method="post">
        <label for="name">Nome:</label><br>
        <input type="text" name="name" required><br><br>
        <label for="email">Email:</label><br>
        <input type="email" name="email" required><br><br>
        <label for="password">Senha:</label><br>
        <input type="password" name="password" required><br><br>
        <input type="submit" value="Cadastrar">
    </form>
    <br>
    <a href="login.jsp">Voltar ao login</a>
    <p style="color:red;"><%= request.getAttribute("error") != null ? request.getAttribute("error") : "" %></p>
</body>
</html>
