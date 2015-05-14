<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>spring과 mybatis framework 연동</h3>
<form method="get" action="member.do">
아이디 <input type="text" name="id">
<input type="hidden" name="command" value="findMemberById">
<input type="submit" value="검색">
</form>
<%--
		views/findbyid_ok.jsp 회원정보 출력 
		      /findbyid_fail.jsp 검색결과없음
		org.kosta.springmvc7.controller.MemberController
		생성자에서 DAO 주입       
 --%>
 <hr>
 <%-- /views/register_result.jsp ( redirect 방식으로 처리 ) 
 		회원가입축하~ 
  --%>
 <form method="post" action="member.do">
아이디 <input type="text" name="id"><br>
패스워드 <input type="password" name="password"><br>
이름 <input type="text" name="name"><br>
주소 <input type="text" name="address"><br>
<input type="hidden" name="command" value="register">
<input type="submit" value="가입">
</form>
<hr>
<form method="get" action="member.do">
<input type="hidden" name="command" value="findByAddress">
주소 : <input type="text" name="address" >
<input type="submit" value="검색">
</form>
<%-- views/findbyaddress_result.jsp
		에서 jstl로 목록을 보여준다. 
 --%>
</body>
</html>












