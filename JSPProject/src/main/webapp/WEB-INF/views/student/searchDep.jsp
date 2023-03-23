<%@ page language="java" contentType="text/html; charset=UTF-8" 
pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
     <style>
        table {
            border-collapse: collapse;
            margin : 0px;
            padding : 0px;
        }
    
        th { 
            border-style: none;
            background-color: black;
            color : white;
            margin : 0px;
            padding : 0px;
        }
        tr {
        	margin : 0px;
            border-style: none;
            padding : 0px;
        }
        
        tr:nth-child(2n){
            background-color: rgb(206, 206, 218);
        }
		
    </style>
</head>
<body>

	<h1>[${ param.departmentSelect }]로 검색한 결과</h1> 
	
	<table>
		<tr>
            <th>순서</th>
			<th>학번</th>
			<th>이름</th>
			<th>학과</th>
			<th>주소</th>
		</tr>
		
		<c:forEach var="student" items="${ stdList }" varStatus="i">
			<tr>
                <td>${ i.index+1 }</td>
				<td>${ student.studentNo }</td>
				<td>${ student.studentName }</td>
				<td>${ student.departmentName }</td>
				<td>${ student.studentAddress }</td>
				
			</tr>
			
			
		</c:forEach>
	</table>
    
    
</body>
</html>