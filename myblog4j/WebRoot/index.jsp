<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>MyBlog4j</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="${applicationScope.keywords }">
	<meta http-equiv="description" content="${applicationScope.description }">

  </head>
  
  <body>
    <div id="top-bar">
    	
    </div>
    <div id="center">
    	<div id="center-left">
    		
    	</div>
    	<div id="center-right">
    		
    	</div>
    </div>
    <div id="foot">
    	<ul>
    		<li style="text-align: center;list-style: none;">
    			MyBlog4j
    		</li>
    	</ul>
    </div>
  </body>
</html>
