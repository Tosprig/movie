<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page import="comedy.dao.*" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
ComedyDao dao = new ComedyDao();
List<Comedy> instan = dao.show();
%>

<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>comedy</title>
<link rel="shortcut icon" href="<%=basePath%>pictures/logo.jpg">
<link href="css/allcss.css" rel="stylesheet" type="text/css">
</head>

<body class="comedy">
<header>
	<img src="pictures/comedy.png" alt="">
	<img src="pictures/comedy1.png" alt="">
</header>
<main>
<%
for(Comedy l:instan){
 %>
<div class="allimg">
	<a href="<%=l.getHrf()%>" target="_blank">
	<img src="images/Comedy/<%=l.getName()%>.jpg" alt="" title="在线观看"></a>
	<p><%=l.getName()%></p>
	<a href="comedyDeleteAction?name=<%=l.getName()%>">删除</a>
</div>

<% }%>

<div class="lastimg">
	<img src="pictures/walk_cycle_.gif" alt="">
	<a href="add.jsp" class="button"><span>添加电影</span></a>
	<a href="succlogin.jsp" class="button"><span>回到首页</span></a>
</div>
</main>

</body>
</html>
