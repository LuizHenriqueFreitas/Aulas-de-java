package ifspcjo.eds.web2;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class classe1 extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	public classe1() {
		super();
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String[] options = req.getParameterValues("options");
		String selectedOptions = "";
		if(options != null && name != null && email != null) {
			for (String option : options) {
				selectedOptions += option + " ";
			}
			resp.setContentType("text/html;charset=UTF-8");
			PrintWriter writer = resp.getWriter();
			writer.println("<!DOCTYPE HTML>");
			writer.println("<html lang\"ptbr\">");
			writer.println("\t<head>");
			writer.println("\t\t<meta charset=\"UTF-8\"/>");
			writer.println("\t\t<title>Página de boas vindas!\"</title>");
			writer.println("\t</head>");
			writer.println("\t<body>");
			writer.println("<h1>CADASTRO REALIZADO COM SUCESSO!</h1> ");
			writer.println("<h2>Nome:" + name + "</h2>");
			writer.println("<h2>Email:" + email + "</h2>");
			writer.println("<h2>Interesses:" + selectedOptions + "</h2>");
			writer.println("\t</body>");
			writer.println("</html>");
			writer.close();
		}
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		doGet(req, resp);
	}
}
