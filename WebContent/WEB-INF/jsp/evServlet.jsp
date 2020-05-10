<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import="model.SiteEv" %>
<%
SiteEv siteEv = (SiteEv)application.getAttribute("siteEv");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>評価ページ</title>
</head>
<body>
<h1>評価</h1>
<a href="/example/EvServlet?action=good">Good! &#x1f604;</a>
<%= siteEv.getGood() %>人
<a href="/examlpe/EvServlet?action=bad">Bad &#x1f614;</a>
<%= siteEv.getBad() %>人

</body>
</html>