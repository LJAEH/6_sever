<%@ page language="java" contentType="text/html; charset=UTF-8" 
pageEncoding="UTF-8" %>

<%
	String inputId = request.getParameter("inputId");
	String[] inputPw = request.getParameterValues("inputPw");
	String name = request.getParameter("name");
	String email = request.getParameter("email");
	String[] hobby = request.getParameterValues("hobby");
	String result = (String)request.getAttribute("%s");
%>
 

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
	<hr>
		
		<% if (inputPw[0].equals(inputPw[1])){ %>
		
		<ul>
			<li>아이디 : <%= inputId %> </li>
			<li>비밀번호 : <%= inputPw[1] %> </li>
			<li>이름 : <%= name %> </li>
			<li>이메일 : <%= email %> </li>
			<li>
				취미 : <%= result %>
				<%-- <% for(String h : hobby){ %>
				<%= h %>
				<% } %> --%>
			</li>
				<h1> <%= name %> 의 회원 가입이 완료되었습니다.</h1>
		</ul>
    	<% } else { %>
    		<h1>'다시'</h1>
    	<% } %>
    	
</body>
</html>