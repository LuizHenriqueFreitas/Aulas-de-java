package exercicio2.login.user;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/login")
public class LoginServer extends HttpServlet 
{
	 private static final String EMAIL_VALIDO = "usuario@exemplo.com";
	 private static final String SENHA_VALIDA = "senha123";
	 
	 @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
    	throws ServletException, IOException {
	        String email = request.getParameter("email");
	        String senha = request.getParameter("senha");
	
	        User user = new User();
	        user.setEmail(email);
	        user.setSenha(senha);
	
	        if (EMAIL_VALIDO.equals(email) && SENHA_VALIDA.equals(senha)) {
	            request.setAttribute("usuario", user);
	            request.getRequestDispatcher("/bemvindo.jsp").forward(request, response);
	        } else {
	            request.getRequestDispatcher("/erro.jsp").forward(request, response);
		        }
	    	}
	 @Override
	    protected void doGet(HttpServletRequest request, HttpServletResponse response)
	    	throws ServletException, IOException {
	        	request.getRequestDispatcher("/login.jsp").forward(request, response);
	    	}
}
