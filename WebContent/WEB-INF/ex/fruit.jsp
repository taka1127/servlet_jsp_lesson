<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="ex.Fruit" %>
<%-- Fruit f = (Fruit)request.getAttribute("fruit"); --%>
<%-- Fruit f = (Fruit)session.getAttribute("fruit"); --%>
<%-- Fruit f = (Fruit)application.getAttribute("fruit"); --%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<p>${applicationScope.fruit.name }の値段は${applicationScope.fruit.price }円です。</p>
</body>
</html>