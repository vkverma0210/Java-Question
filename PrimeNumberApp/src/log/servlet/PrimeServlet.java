package log.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PrimeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
    public PrimeServlet() {
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int n = Integer.parseInt(request.getParameter("num"));	
		PrintWriter out = response.getWriter();
		
		if(n <= 1)
		{
			out.print(n + "<font color=\"green\"><b> is not a Prime Number</b></font>");
//			response.sendRedirect("IsNotPrime.html");
			return;
		}
		
		for(int i = 2; i * i <= n; i++)
		{
			if(n % i == 0)
			{
				out.print(n + "<font color=\"green\"><b> is not a Prime Number</b></font>");
//				response.sendRedirect("IsNotPrime.html");
				return;
			}
		}
		
		out.print(n + "<font color=\"green\"><b> is a Prime Number</b></font>");
//		response.sendRedirect("IsPrime.html");
		return;
	}

}
