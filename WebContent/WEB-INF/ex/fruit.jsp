<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="ex.Fruit" %>
<%-- Fruit f = (Fruit)request.getAttribute("fruit"); --%>
<% Fruit f = (Fruit)session.getAttribute("fruit"); %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<p><%= f.getName() %>の値段は<%= f.getPrice() %></p>
<p><%= f.getClass() %></p>
</body>
</html>