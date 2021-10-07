<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>The Out Object Example</title>
</head>
<body bgcolor="sky blue">
	<%
		out.print("<h3> JSP BufferInformation </h3>");
	%>

	<%-- display the page buffer size --%>
	Buffer :
	<%=out.getBufferSize()%>
	bytes
	<br />

	<%-- display the AutoFlush setting --%>
	AutoFlush:
	<%=out.isAutoFlush()%>
	<br />

	<%-- display the free page buffer space --%>
	Remaining buffer :
	<%=out.getRemaining()%>
	bytes
</body>
</html>