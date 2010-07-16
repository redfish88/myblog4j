<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.fckeditor.net" prefix="FCK" %>



<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
  <head>
    
    <title>文章管理 -- myblog4j</title>
    <link rel="stylesheet" href="/skin/default/style.css" type="text/css"></link>
	<style type="text/css">
		#center{
			width:1001px;
			margin: 0 auto;
		}
		#center-left{
			width:600px;
			float:left;
			list-style: none;
		}
		#center-left a{
			line-height:20px;
			text-decoration: none;
		}
		#center-right{
			float:left;
			list-style:none;
		}
	</style>
</head>
  
  <body>
	<%@ include file="top.jsp" %>
    <div id="center">
    	<li style="float:right;">
    		<a href="/admin/writeblog.do">发表文章</a>	
    	</li>
    	
    </div>
    <%@ include file="foot.jsp" %>
  </body>
</html>
