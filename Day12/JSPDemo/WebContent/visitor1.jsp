<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>First page</h1>
	<%
		Integer counter=0;
	
		counter = (Integer) session.getAttribute("count");
		if (counter != null) {
			counter++;
			session.setAttribute("count", counter);
		} else {
			counter = 0;
			counter++;
			session.setAttribute("count", counter);
		}
		out.println("Servlet One Visitor Counter: "+counter);
	
		%>
</body>
</html>