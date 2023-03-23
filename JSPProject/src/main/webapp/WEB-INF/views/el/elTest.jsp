<%@ page language="java" contentType="text/html; charset=UTF-8" 
pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>1. EL</title>
</head>
<body>
	<h1>EL(Expression Language)</h1>
    <pre>
    	JSP의 표현식을
    	조금 더 효율적으로 간단히 작성할 수 있도록 고안된 표현 언어
    	
    	화면에 출력하고자 하는 자바코드를 
    	${ key } 형식으로 작성하면
    	해당 위치에 value가 출력됨
    	
    	(추가적인 작성법도 존재)
    	
    	** EL의 특징 **
    	
    	1. get이라는 단어를 사용하지 않는다
    	왜? EL == 화면에 표현하는 언어
    		   == 출력용 언어(setting 불가능)
    		   == set 이 불가능하여 get도 생략 (무조건 get 수행)
    	2. EL은 null은 빈칸으로 처리한다
    	  \${ null인 변수 } => 빈칸 출력
    	  \${ NullPointException 발생 코드 } => 빈칸 출력(예외발생 X)
    </pre>
    
    테스트 1 : <%= request.getParameter("test") %> <br>
    테스트 2 : ${ param.test } <br>
    
    
    <form action="/JSPProject/elTest" method="post">
    	이름 : <input type="text" name="inputName">
    	나이 : <input type="number" name="inputAge">
    	주소 : <input type="text" name="inputAddress">
		<hr>
		
		<button>제출</button>
    </form>
    
    <hr>
    
   <ul>
		<li>request scope message : ${message}</li>
		<li>session scope sessionValue : ${sessionValue}</li>
		<li>application scope appValue : ${appValue}</li>
	</ul>
    
</body>
</html>