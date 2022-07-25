package aplicacoes;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;





public class IndexServlet extends HttpServlet{
	
	@Override
	 public void doGet(HttpServletRequest req, HttpServletResponse res) {
		
		try {
			PrintWriter out = res.getWriter();
			out.println("<html>");
			out.println("<head>");
			out.println("<title> Cadastro de Dados Pessoais</title>");
			out.println("</head>");
			out.println("<body>");
			out.println("<h2>Acessar Cadastro de Clientes</h2>");
			out.println("<hr/>");
			out.println("<a href='http://localhost:8080/Cadastro/ListarCadastro' style='color: blue'> Clique aqui para fazer login");
			out.println("<br>");
			//out.println("<a href='http://localhost:8080/Cadastro/NovoCadastro'>Novo cadastro</a>");
			out.println("<br>");
			//out.println("<a href='http://localhost:8080/Cadastro/Logoff'>Sair</a>");
			out.println("</body>");
			out.println("</html>");
			
		}catch( IOException e) {
			
		}
	 }
	
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) {
		
	}

}
