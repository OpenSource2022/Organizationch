<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<link rel="stylesheet" type="text/css" href="Style.css" />
<link href="//maxcdn.bootstrapcdn.com/font-awesome/4.1.0/css/font-awesome.min.css" rel="stylesheet" />
<html>
<head>
<meta charset="UTF-8">
<title>Calculation Result</title>
</head>
<body>

<form method="post" action="mysearchweb">
<input type="text" name="n1">
<input type="submit" value="run">
</form>
In the right JSP<br>
<font color=black>
<%=request.getAttribute("result") %>
</font>
TEST
</body>
</html>