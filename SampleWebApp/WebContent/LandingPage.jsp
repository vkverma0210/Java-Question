<%@page import="java.util.Iterator"%>
<%@page import="com.wipro.bean.EmployeeBean"%>
<%@page import="java.util.List"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Landing Page</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
</head>
<body>
	<br>
	<center>
		<a href="EmployeeController" class="btn btn-primary">View All
			Employees</a>
	</center>
	<br>
	<br>
	<div class="container">
		<table width="40%" align="center"
			class="table table-bordered table-striped">
			<%
				List<EmployeeBean> employeeList = (List<EmployeeBean>) request.getAttribute("employeeList");
				if (employeeList != null) {
			%>
			<tr>
				<th>Employee Id</th>
				<th>Employee Name</th>
				<th>Employee Salary</th>
			</tr>

			<%
				Iterator<EmployeeBean> it = employeeList.iterator();

					while (it.hasNext()) {
						EmployeeBean bean = it.next();
			%>
			<tr>
				<td><%=bean.getEmployeeId()%></td>
				<td><%=bean.getEmployeeName()%></td>
				<td><%=bean.getEmployeeSalary()%></td>
			</tr>

			<%
				}
				}
			%>
		</table>
	</div>
</body>
</html>