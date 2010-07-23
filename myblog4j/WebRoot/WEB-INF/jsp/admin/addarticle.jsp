<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<%@ taglib uri="http://java.fckeditor.net" prefix="fck" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>添加文章</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">


  </head>
  
  <body>
    <form action="">
    	<table>
    		<tr>
    			<td>
    			</td>
    		</tr>
    		<tr>
    			<td>
    			<FCK:editor instanceName="EditorDefault" toolbarSet="PluginTest">
				<jsp:attribute name="value">This is some <strong>sample text
					</strong>. You are using <a href="http://www.fckeditor.net">
					FCKeditor</a>.
				</jsp:attribute>
				<jsp:body>
					<FCK:config CustomConfigurationsPath="${pageContext.request.contextPath}/admin/fckconfig.js" />
				</jsp:body>
				</FCK:editor>
    			</td>
    		</tr>
    	</table>
    </form>
  </body>
</html>
