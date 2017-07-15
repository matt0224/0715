package tw.matt;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/matt18")
public class matt18 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		request.setCharacterEncoding("UTF-8");
		
		RequestDispatcher dispatcher = 
				request.getRequestDispatcher("matt17");
		
		out.println("<h1>matt Big Company: matt18</h1>");
		out.println("<hr/>");

		dispatcher.forward(request, response);

		out.println("<hr />");
		out.println("Copyleft");

	}
}
