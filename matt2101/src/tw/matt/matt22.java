package tw.matt;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Brad22")
public class matt22 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		request.setCharacterEncoding("UTF-8");

		testSQL();
	}
	
	private void testSQL() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn =
				DriverManager.getConnection(
					"jdbc:mysql://127.0.0.1:3306/matt02?user=root&password=root");
			
			Statement stmt = conn.createStatement();
			stmt.executeUpdate("INSERT INTO cust (account,passwd) VALUES ('matt','123')");
			stmt.close();
			System.out.println("Insert OK");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	
}

