package tw.matt;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//用URL方式
@WebServlet("/matt01")

public class matt01 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
//		System.out.println("doGet");
		response.setContentType("text/html; charset=UTF-8");
		try (PrintWriter writer = response.getWriter()){ //.getWriter輸出 reder是輸入
			writer.write("Hello, World");
			writer.flush();
		}
		
	}
}
