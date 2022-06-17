<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>

<!DOCTYPE html>
<link rel="stylesheet" type="text/css" href="Style.css" />
<!--  <link href="//maxcdn.bootstrapcdn.com/font-awesome/4.1.0/css/font-awesome.min.css" rel="stylesheet" />-->
<link href="/Users/mmm.zip/DATAWEB/openS2022/src/main/webapp/WEB-INF/font/BMJUA_otf.otf" rel="stylesheet" />
<html>
<head>
<link href="//maxcdn.bootstrapcdn.com/font-awesome/4.1.0/css/font-awesome.min.css" rel="stylesheet">
<meta charset="UTF-8">
<title>Calculation Result</title>
</head>
<body>

<caption><center><h1><img src ="PageLogo_colored.png" width="500" height="200" alt="로고"/></h1></center></caption>
<form method="post" action="mysearchweb">
<div class ="box">
	<div class="container-1">
	<input type="text" id="text" name="n1" placeholder="검색어 입력">
	<button class="icon" type="submit" name="click" value=""><i class="fa fa-search"></i></button>	
	<!-- 	
	<input type="text" id="text" name="n1" placeholder="검색어 입력" style="text-align:center; vertical-align:middle">
		<span class="icon"><i class ="fa fa-search"></i></span>
		<input type="text" id="text" placeholder="Search" />
		<input type="submit" value="run">
	 -->	 
	</div>
</div>
</form>

<!--  
In the right JSP<br>-->
<font color=black>
<!-- request.getAttribute("result") -->
<%=request.getAttribute("result")
%>
</font>
</body>
</html>