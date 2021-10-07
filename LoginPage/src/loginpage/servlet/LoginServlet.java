package loginpage.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		String userName = request.getParameter("uname");
		String password = request.getParameter("pwd");
		
		if(userName.equals("Admin") && password.equals("wipro@123"))
		{
			out.println("<font color = green><b>Welcome Admin</b></font>");
		}
		else
		{
			out.println("<font color = red><b>Invalid User Or Password</b></font>");
		}
		
		out.close();
	}

}
