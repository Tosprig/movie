<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page import="mystery.dao.*" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
MysteryDao dao = new MysteryDao();
List<Mystery> instan = dao.show();
%>

<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>mystery</title>
<link rel="shortcut icon" href="<%=basePath%>pictures/logo.jpg">
<link href="css/allcss.css" rel="stylesheet" type="text/css">
</head>

<body class="mystery">
<header>
	<img src="pictures/mystery.png" alt="">
	<img src="pictures/mystery1.png" alt="">
</header>
<main>
<%
for(Mystery l:instan){
 %>
<div class="allimg">
	<a href="<%=l.getHrf()%>" target="_blank">
	<img src="images/Mystery/<%=l.getName()%>.jpg" alt="" title="在线观看"></a>
	<p><%=l.getName()%></p>
	<a href="mysteryDeleteAction?name=<%=l.getName()%>">删除</a>
</div>

<% }%>

<div class="lastimg">
	<img src="pictures/running_2_.gif" alt="">
	<a href="add.jsp" class="button"><span>添加电影</span></a>
	<a href="succlogin.jsp" class="button"><span>回到首页</span></a>
</div>
</main>

</body>
</html>
