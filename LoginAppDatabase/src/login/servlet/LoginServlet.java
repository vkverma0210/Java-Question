package login.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private static final String JDBC_DRIVER = "org.h2.Driver";
	private static final String DB_URL = "jdbc:h2:tcp://localhost/~/test1";
	private static final String USER = "system";
	private static final String PASS = "";

	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;

	public LoginServlet() throws ClassNotFoundException, SQLException {
		Class.forName(JDBC_DRIVER);
		conn = DriverManager.getConnection(DB_URL, USER, PASS);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("uname");
		String password = request.getParameter("pwd");
		
		PrintWriter out = response.getWriter();
		
		try {
			if(authenticate(username, password))
			{
				response.sendRedirect("HomePage.html");
//				out.println("<!DOCTYPE html>" + "<html>" + "<body>" + "<h2><font color = green><b>Login Success!</b></font></h2>" + "Welcome" + "</body>" + "</html>");
			}
			else
			{
				response.sendRedirect("Error.html");
//				out.println("<!DOCTYPE html>" + "<html>" + "<body>" + "<h2><font color = red><b>Login Failed!</b></font></h2>" + "Username Or Password Incorrect" + "</body>" + "</html>");
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
	
	private boolean authenticate(String username, String password) throws SQLException
	{
		pstmt = conn.prepareStatement("select count(*) as count from usrdb where username = ? and password = ?");
		pstmt.setString(1, username);
		pstmt.setString(2, password);
		rs = pstmt.executeQuery();
		
		if(rs.next() && (rs.getInt("count") == 1))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
