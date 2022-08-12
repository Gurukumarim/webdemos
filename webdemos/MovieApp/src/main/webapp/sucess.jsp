<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%

String username=(String)request.getAttribute("username");
out.print("Welcome "+username); 



%>
<form action="showmovies">

select movie type<select name="type">

<option value = "select">--select--</option>
<option value = "comedy">comedy</option>
<option value = "action">action</option>
<option value = "drama">drama</option>
<option value = "love">love</option>

</select><br>

<input type="submit" value="Add"></input>

</form>
</body>
</html>