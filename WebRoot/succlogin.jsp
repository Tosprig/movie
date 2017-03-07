<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>movie bigbang</title>
<link rel="shortcut icon" href="<%=basePath%>pictures/logo.jpg">
<link href="movieBigbang1.css" rel="stylesheet">
</head>

<body>
<nav>
<ul><li class="firstli">
		<a href="love.jsp" class="button">
			<span class="line line-top"></span>
			<span class="line line-right"></span>
			<span class="line line-bottom"></span>
			<span class="line line-left"></span>
			love story
		</a>
	</li>
	<li class="secondli">
		<a href="animation.jsp" class="button">
			<span class="line line-top"></span>
			<span class="line line-right"></span>
			<span class="line line-bottom"></span>
			<span class="line line-left"></span>
			animation
		</a>
	</li>
	<li class="thirdli">
		<a href="comedy.jsp" class="button">
			<span class="line line-top"></span>
			<span class="line line-right"></span>
			<span class="line line-bottom"></span>
			<span class="line line-left"></span>
			comedy
		</a>
	</li>	
	<li class="fouthli">
		<a href="mystery.jsp" class="button">
			<span class="line line-top"></span>
			<span class="line line-right"></span>
			<span class="line line-bottom"></span>
			<span class="line line-left"></span>
			mystery
		</a>
	</li>
</ul>
</nav>

<div class="container">
	<div class="center col-1024">
    	<img src="touming.png" alt="">
    </div>
  	<div class="center col-1024">
  		<a href="love.jsp">
        <img src="love.jpg" alt="" title="爱情类电影"></a>
  	</div>
	<div class="center col-1024">
    	<a href="animation.jsp">
        <img src="animation.jpg" alt="" title="动漫类电影"></a>
    </div>
	<div class="center col-1024">
    	<a href="comedy.jsp">
        <img src="comedy.jpg" alt="" title="喜剧类电影"></a>
    </div>
	<div class="center col-1024">
    	<a href="mystery.jsp">
        <img src="mystery.jpg" alt="" title="悬疑类电影"></a>
    </div> 
</div>

<div class="col-1400 center">
	<img src="di.gif" alt="">
	<img src="di.gif" alt="">
  	<img src="di.gif" alt="">
</div>


</body>
</html>
