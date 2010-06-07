<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
  <head>
    
    <title>后台管理 -- myblog4j</title>
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
    	<div id="center-left">
    		<li><b>欢迎使用MyBlog4j,您可以选择以下的快捷菜单以开始您的Blog之旅.</b></li>
    		<li>
    			<a href="#">发表一篇文章</a>
    		</li>
    		<li>
    			<a href="#">管理网站信息</a>
    		</li>
    		<li>
    			<a href="#">更换一个显示风格</a>
    		</li>
    		<div>
    			<li>
    				<b>统计信息</b>
    			</li>
    			<li>
    				当前共有#count篇文章,#topic条评论.<br/>
    				上次登录:#lastlogintime
    			</li>
    		</div>
    	</div>
    	<div id="center-right">
    		<li>
    			<b>官方消息</b>
    		</li>
    		<li>
    			Loading...
    		</li>
    	</div>
    </div>
    <%@ include file="foot.jsp" %>
  </body>
</html>
