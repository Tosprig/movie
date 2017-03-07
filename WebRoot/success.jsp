<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!doctype html>

<meta http-equiv="refresh" content="3; url=login.jsp" />
<html>   
  <head>   
  <title> 成功页面 </title> 
  <link rel="shortcut icon" href="<%=basePath%>pictures/logo.jpg"> 
  </head>   
  <body>   
  <h1 align="center">您已成功注册！</h1>  
  <p>3秒后自动跳到登录页面</p> 
  </body>   
</html> 