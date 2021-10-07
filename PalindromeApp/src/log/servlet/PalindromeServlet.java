package log.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PalindromeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public PalindromeServlet() {

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String input1 = request.getParameter("str");	
		PrintWriter out = response.getWriter();
		
		int len = input1.length() - 1;
        int i = 0;

        String str = input1.toLowerCase();

        while (i < len) {
            if (str.charAt(i) != str.charAt(len)) {
            	out.print(input1 + "<font color=\"green\"><b> is not Palindrome.</b></font>");
            	return;
            }

            i++;
            len--;
        }
		
		out.print(input1 + "<font color=\"green\"><b> is a Palindrome.</b></font>");

		return;
	}

}
