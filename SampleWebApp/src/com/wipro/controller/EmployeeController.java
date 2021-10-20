package com.wipro.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wipro.bean.EmployeeBean;
import com.wipro.dao.EmployeeDAO;

public class EmployeeController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		EmployeeDAO dao = new EmployeeDAO();
		List<EmployeeBean> employeeList = dao.getAllEmployee();

		request.setAttribute("employeeList", employeeList);
		request.getRequestDispatcher("landingPage.jsp").forward(request, response);
	}
}
