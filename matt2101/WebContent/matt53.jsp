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
    application.setAttribute("key1", 123); //app是影藏物件 數字是物件 key自訂
    application.setAttribute("x", 123);
	request.setAttribute("x", (int)(Math.random()*49+1));
	String x = request.getParameter("x");
	
	Integer intX = (int)request.getAttribute("x");
	out.println(x + "<br>");
	out.println(intX);

  %>
  <hr>
<a href="matt54.jsp">Goto matt54.jsp</a>
</body>
</html>