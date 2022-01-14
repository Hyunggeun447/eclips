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
	StringBuffer url = request.getRequestURL(); // request는 내장객체로서 이미 선언이 되어있다.
	out.print("url = "+url.toString()); // out 역시 마찬가지이다.
	out.print("<br>");
%>

</body>
</html>