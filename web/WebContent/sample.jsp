<%@page import="web.Seito"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>


<%
//変数宣言
int a=20;
String aa ="HelloWorld";

Seito s = new Seito();
s.setName("ooo");

%>
<%for(int i = 0;i<10;i++){ %>



<%=s.getName()%><br>



<% }%>
<h1><%=aa %></h1>
<p><%=a *20000000%></p>
<!-- this is html comment-->
<%--this is jsp comment --%>


</body>
</html>