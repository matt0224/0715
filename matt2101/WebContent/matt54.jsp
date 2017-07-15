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
    Integer x=(Integer)application.getAttribute("x"); //放app都是物件要打回原形
    out.print(x);
    x++;
    application.setAttribute("x", x);
   
   %>
</body>
</html>