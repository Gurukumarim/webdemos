<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%!String name = "ram";%>

	<%="welcome " + name%>
	<%
	int x = 10, y = 20;
	%>
	<%="sum" + (x + y)%>
	<%=" Have a great day "%>

	<%!int count = 100;%>
	you are visitor number<%=count--%>

	<%!String greet() {
	return "Welcome back";

}%>
	}

</body>
</html>