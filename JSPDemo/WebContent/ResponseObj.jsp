<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Response Object Info</title>
</head>
<body bgcolor="sky blue">
	<%
		response.setContentType("text/html");
	%>

	Buffer Size:
	<% response.getBufferSize(); %>
	bytes

	<br /> Character Encoding:
	<%=response.getCharacterEncoding()%>

	<br /> Locale:
	<%=response.getLocale()%>

	<%-- redirect the user to another.html --%>
	<%
		response.sendRedirect("http://localhost:8080/another.html");
	%>
</body>
</html>
