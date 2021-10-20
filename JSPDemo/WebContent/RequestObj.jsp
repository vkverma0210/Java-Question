<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Request Header info</title>
</head>
<body bgcolor="lime yellow">
	<ul>
		<li>Request Method: <%=request.getMethod()%>
		</li>

		<li>Request URL: <%=request.getRequestURL()%>
		</li>

		<li>Request Protocol: <%=request.getProtocol()%>
		</li>

		<li>Server Name: <%=request.getServerName()%>
		</li>

		<li>Server Port: <%=request.getServerPort()%>
		</li>

		<li>Remote Address: <%=request.getRemoteAddr()%>
		</li>

		<li>Browser: <%=request.getHeader("User-Agent")%>
		</li>
	</ul>
</body>
</html>