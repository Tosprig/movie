<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page import="animation.dao.*" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
AnimationDao dao = new AnimationDao();
List<Animation> instan = dao.show();
%>

<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>animation</title>
<link rel="shortcut icon" href="<%=basePath%>pictures/logo.jpg">
<link href="css/allcss.css" rel="stylesheet" type="text/css">

</head>

<body class="animation">
<header>
	<img src="pictures/animation.png" alt="">
	<img src="pictures/animation1.png" alt="">
</header>
<main>
<%
for(Animation l:instan){
 %>
<div class="allimg">
	<a href="<%=l.getHrf()%>" target="_blank">
	<img src="images/Animation/<%=l.getName()%>.jpg" alt="" title="在线观看"></a>
	<p><%=l.getName()%></p>
	<a href="animationDeleteAction?name=<%=l.getName()%>">删除</a>
</div>

<% }%>



<div class="lastimg">
	<img src="pictures/animation2.gif" alt="">
	<a href="add.jsp" class="button"><span>添加影视</span></a>
	<a href="succlogin.jsp" class="button"><span>回到首页</span></a>
</div>

</main>

</body>
</html>
