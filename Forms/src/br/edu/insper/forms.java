package br.edu.insper;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class forms
 */
@WebServlet("/forms")
public class forms extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public forms() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		String nome = request.getParameter("nome");

        String curso = request.getParameter("curso");

        String email = request.getParameter("email");;

        

        String htmlResponse = "<html>";

        htmlResponse += "<body><p>Nome: "+nome+"</p>";

        htmlResponse +="<p>Curso: "+curso+"</p>";

        htmlResponse +="<p>E-mail: "+email+"</p>";

        htmlResponse += "<form name=\"confirm\" method=\"get\" action=\"confirm\">"

                         + "<input type=\"submit\" value=\"Confirmar\" /></form>";

        htmlResponse +="</html>";



        PrintWriter out = response.getWriter();

        

        out.println(htmlResponse);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request,response);
		
		
		
		
		
		
		
	}
	

}
