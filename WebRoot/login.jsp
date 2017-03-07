<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!doctype html>

<html>
    <head>
    <title>登录页面</title>
    	<link rel="shortcut icon" href="<%=basePath%>pictures/logo.jpg">
 		<link href="css/login.css" rel="stylesheet" type="text/css">
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
 <s:form action="login" method="post">
  <div align="center"><img src="pictures/login1.gif" width="200" height="180" alt=""/></div>
       <table align="center" cellspacing=5 border=5 bordercolor=#acdbc9>
          <s:textfield name="username" label="用户名" size="18" />
           <s:password name="password" label="密码" size="18" />
           <s:submit value="登录" />
           </table><br>
           <p class="zhuce"><s:a href="register.jsp">新用户注册</s:a></p>
       </s:form>
       <div align="center">
    <img src="pictures/login2.gif" width="250" height="250" alt=""/>
    <img src="pictures/login3.gif" width="250" height="250" alt=""/>
    <img src="pictures/login4.gif" width="250" height="250" alt=""/>
    <img src="pictures/login5.gif" width="250" height="250" alt=""/>
    <img src="pictures/login6.gif" width="250" height="250" alt=""/>
    </div>
    </body>
</html>
 