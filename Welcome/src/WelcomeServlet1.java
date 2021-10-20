
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class WelcomeServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("name");
		name = name.toUpperCase();
		out.print("<h1> Name : " + name + "</h1>");
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("WelcomeServlet2");
		requestDispatcher.include(request, response);
		out.print("<h3>Thank You </h>");
		
		out.close();
	}
}
