<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    
    <title>管理后台</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<script type="text/javascript">
		function _(id)
		{
			return document.getElementById(id);
		}
		function login()
		{
			_("lf").submit();
		}
	</script>
  </head>
  
  <body>
    <div>
    <form id="lf" action="login.do" method="post">
    	<table>
    		<tr>
    			<td> 
    				用户名: 
    			</td>
    			<td>
    				<input type="text" name="nickname" id="nickname" />
    			</td>
    		</tr>
    		<tr>
    			<td>
    				密码:
    			</td>
    			<td>
    				<input type="password" name="pwd" id="pwd" />
    			</td>
    		</tr>
    		<tr>
    			<td colspan="2">
    				<input type="button" value="登录" onclick="javascript:login();" />
    				<input type="reset" value="重置" />
    			</td>
    		</tr>
    	</table>
    	</form>
    </div>
  </body>
</html>
