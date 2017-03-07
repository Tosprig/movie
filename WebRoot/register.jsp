<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib uri="/struts-tags" prefix="s"%>   
<!doctype html>

<html>   
  <head>   
    <title> 注册页面 </title>  
    <link rel="shortcut icon" href="<%=basePath%>pictures/logo.jpg"> 
    <link href="css/register.css" rel="stylesheet">
  </head>   
  <body> 
  <div align="center"><img src="pictures/r.gif" width="180" height="139" alt=""/></div>  
   <div align="center">
     <s:form action="register" method="post">  
      <table align="center" cellspacing=5 border=5 bordercolor=#acdbc9>    
       <s:textfield name="username" label="用户名"></s:textfield>   
       <s:password name="password" label="密码"></s:password>
       <s:textfield name="email" label="邮箱"></s:textfield>
       <s:textfield name="phonenum" label="手机号"></s:textfield>    
       <s:submit value="注册"></s:submit> 
       </table>
   </s:form>   
   </div> 
   <div align="center">
   <img src="pictures/r1.gif" width="300" height="214" alt=""/>
   <img src="pictures/r2.gif" width="300" height="214" alt=""/>
   <img src="pictures/r3.gif" width="300" height="214" alt=""/>
   <img src="pictures/r4.gif" width="300" height="214" alt=""/>
   </div>  
  </body>   
</html> 