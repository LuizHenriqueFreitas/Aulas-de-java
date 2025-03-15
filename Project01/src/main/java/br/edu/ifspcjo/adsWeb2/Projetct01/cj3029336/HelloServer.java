package br.edu.ifspcjo.adsWeb2.Projetct01.cj3029336;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/servlet1") //mapeamento do servlet
public class HelloServer extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	public HelloServer() {
		super();
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
		throws ServletException, IOException {
		
		// setar a codificação de caracteres da requisição
		req.setCharacterEncoding("UTF-8");
		//Obter os dados da requisição
		String name = req.getParameter("name");
		
		//setar o tipo de conteúdo e caracteres da resposta
		resp.setContentType("text/html;charset=UTF-8");
		//obter o escritor da resposta
		PrintWriter writer = resp.getWriter();
		writer.println("<!DOCTYPE HTML>");
		writer.println("<html lang\"ptbr\">");
		writer.println("\t<head>");
		writer.println("\t\t<meta charset=\"UTF-8\"/>");
		writer.println("\t\t<title>Página de boas vindas!\"</title>");
		writer.println("\t</head>");
		writer.println("\t<body>");
		writer.println("<h1>Seja bem vindo(a), " + name + " !</h1> ");
		writer.println("\t</body>");
		writer.println("</html>");
		writer.close();
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doGet(req, resp);
	}

}