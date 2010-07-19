<%@ page language="java" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>类别管理</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
		
	<style>
		*{
			font-size: 12px;
			text-decoration: none;
		}
		li{
			list-style:none;
		}
		.parent{
			font-size: 14px;
			font-weight: bolder;
			line-height: 22px;
		}
		.child{
			padding-left:40px;
			padding-bottom:8px;
			font-size: 12px;
		}
	</style>
  </head>
  
  <body>
    
    <div id="center">
    	<li style="float:right;">
    		<a href="#">添加类别</a>
    	</li>
    	<br/>
    	<br/>
    	<c:forEach items="${requestScope.TypeList}" var="ins">
    			<c:if test="${ins.rootId == 0}">
    			<li class="parent">
    				<span><span>${ins.type }</span><span style="float:right;"><img style="cursor: pointer;" src="/admin/images/delete.gif" alt="删除" /></span></span>
    			</li>
					<c:forEach items="${requestScope.TypeList}" var="child">
						<c:if test="${child.rootId == ins.typeId}">
						<li class="child">
							<span><span>${child.type }</span><span style="float:right;"><img style="cursor: pointer;" src="/admin/images/delete.gif" alt="删除" /></span></span>
						</li>
						</c:if>
					</c:forEach>
				</c:if>
    		
    	</c:forEach>
    </div>
    
  </body>
</html>
