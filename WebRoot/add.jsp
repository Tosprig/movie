<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML>
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>edit movie</title>
    <link rel="shortcut icon" href="<%=basePath%>pictures/logo.jpg">
    <link href="css/add.css" rel="stylesheet" type="text/css">
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
  <header>
  添加电影
  </header>
  <main>
  
  <div>
  <h5>爱情类：</h5>
   <form action="loveAddAction" method="post" enctype="multipart/form-data">
   电影名：<input type="text" name="name">
   图片：<input type="file" name="image">
  超链接：<input type="text" name="hrf">
  <input type="submit" value="提交">
   </form>
</div>

<div>
  <h5>动画类：</h5>
   <form action="animationAddAction" method="post" enctype="multipart/form-data">
   电影名：<input type="text" name="name">
   图片：<input type="file" name="image">
  超链接：<input type="text" name="hrf">
  <input type="submit" value="提交">
   </form>
</div>

<div>
  <h5>喜剧类：</h5>
   <form action="comedyAddAction" method="post" enctype="multipart/form-data">
   电影名：<input type="text" name="name">
   图片：<input type="file" name="image">
  超链接：<input type="text" name="hrf">
  <input type="submit" value="提交">
   </form>
</div>

<div>
  <h5>悬疑类：</h5>
   <form action="mysteryAddAction" method="post" enctype="multipart/form-data">
   电影名：<input type="text" name="name">
   图片：<input type="file" name="image">
  超链接：<input type="text" name="hrf">
  <input type="submit" value="提交">
   </form>
</div>



</main>
  </body>
</html>
