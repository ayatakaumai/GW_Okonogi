<%@page import="web.EmpBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- webパッケージのEmpBeansクラスを使うよって定義 -->
<jsp:useBean id="EMP" scope="request" class="web.EmpBean" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>サンプル</title>
</head>
<body>
<%
EmpBean a = new EmpBean();

HttpSession ses = request.getSession(true);



%>




	<h1>UseBean</h1>
	<table border="1">
		<tr>
			<td>Name</td>
			<!--リクエストオブジェクトに格納されている
			beanの中のプロパティ名がnameの値を取得している。
			 -->
			<td><jsp:getProperty name="EMP" property="name" /></td>
		</tr>
		<tr>
			<td>Age</td>
			<td><%=ses.getAttribute("age") %></td>
		</tr>
	</table>
</body>
</html>