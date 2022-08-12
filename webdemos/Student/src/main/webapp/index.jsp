<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="RegisterServlet">
		Enter name<input type="test" name="name"><br> Enter
		studentId<input type="test" name="studentId"> <br> Enter
		city <input type="test" name="city"><br> choose Language<select
			name="language">

			<option value="select">---select---</option>
			<option value="java">java</option>
			<option value="jsp">jsp</option>
			<option value="spring">Spring</option>
			<option value="hibernet">Hibernet</option>


		</select> Enter Hobbies<input type="text" name="hobbies"><br> <input
			type="checkbox" value="music" name="hobby">Music<br> <input
			type="checkbox" value="dance" name="hobby"> Dance<br>
		<input type="checkbox" value="sports" name="hobby"> Sports<br>
		<input type="checkbox" value="reading" name="hobby">Reading<br>
		<br> <input type="submit">


	</form>

</body>
</html>