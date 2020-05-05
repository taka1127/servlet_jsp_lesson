<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import="java.util.Date, java.text.SimpleDateFormat"  %>
<%
String[] luckArray = {"大吉", "中吉", "小吉", "吉", "凶", "大凶"};
int index = (int) (Math.random() * 6);
String luck = luckArray[index];

Date date = new Date();
SimpleDateFormat sdf = new SimpleDateFormat("MM月dd日");
String today = sdf.format(date);

%>
<!DOCTYPE html>

<html>
<link rel="stylesheet" href="${pageContext.request.contextPath}/main.css" type="text/css">
<head>
<meta charset="UTF-8">
<title>占い</title>
</head>
<body>
<p id=test1>JSPです。<%= today %>の運勢は「<%=luck %>」です</p>

<p>test</p>
    <script type="text/javascript" src="test.js"></script>
</body>
</html>