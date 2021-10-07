package com.wipro.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wipro.bean.UserBean;
import com.wipro.dao.UserDAO;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginServlet() {
		super();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// a. Fetch the input values

		String name = request.getParameter("uname");
		String pwd = request.getParameter("pwd");

		// b. Create an UserBean object and initialize

		UserBean bean = new UserBean(name, pwd);

		// c. Create userDAO object

		UserDAO dao = new UserDAO();

		// d. Attach the result as an attribute

		String sts = dao.checkUser(bean);
		request.setAttribute("result", sts);

		// e. Forward the request to result.jsp

		request.getRequestDispatcher("Result.jsp").forward(request, response);
	}
}
