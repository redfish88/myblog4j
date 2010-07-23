<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title></title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<script type="text/javascript" src="/common/jquery/jquery-1.4.2.min.js"></script>
	<script type="text/javascript">
		function addType()
		{
			
			var type = $("#type").val();
			var depict = $("#depict").val();
			var parent = $("#parent").val();
			if(type && depict && parent)
			{
				$("#typeform").submit();
			}else
			{
				alert("必填填不能为空");
			}
		}
	
	</script>

  </head>
  
  <body>
  <form id="typeform" action="/admin/addtype.do" method="post">
    <table>
    	<tr>
    		<td>
    			类别名称
    		</td>
    		<td>
    			<input id="type" type="text" name="type" />
    		</td>
    	</tr>
    	<tr>
    		<td>
    			描述
    		</td>
    		<td>
    			<textarea id="depict" rows="5" cols="20" name="depict"></textarea>
    		</td>
    	</tr>
    	<tr>
    		<td>
    			父类
    		</td>
    		<td>
	    		<select id="parent" name="parent">
	    			<option value="0">
	    				无
	    			</option>
	    		<c:forEach items="${requestScope.TypeList}" var="ins">
	   				<option value="${ins.typeId }">
	   					${ins.type }
	   				</option>
	    		</c:forEach>
	    		</select>
    		</td>
    	</tr>
    	<tr>
    		<td>
    			<input type="button" value="添加" onclick="javascript:addType();" />
    			<input type="reset" value="重置" />
    		</td>
    	</tr>
    </table>
  </form>
  </body>
</html>
