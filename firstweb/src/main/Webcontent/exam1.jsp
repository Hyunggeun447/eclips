<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
id = <%=getID() %>

<%!
	String id = "20";
	public String getID(){
		return id;
	}
%>

<%
	for(int i=1; i<6; i++){
%>

<H<%=i %>>아름다운 한글</H<%=i %>>

<%
	}
%>
<%-- jsp 주석 --%>
<!-- html 주석임 -->


<%
//자바 주석임
//jsp 주석은 java로 안넘어감. java주석은 넘어는 가나 실행 안됌. html주석은 실행도 되나 화면 표시안됌.

%>

</body>
</html>