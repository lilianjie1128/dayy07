<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="<%=request.getContextPath()%>/css/css.css" rel="stylesheet">
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-1.8.2.min.js"></script>
<script type="text/javascript">
$(function () {
	$.post("selectClass",function(obj){
		for ( var x in obj) {
			$("#cid").append("<option value='"+obj[x].cid+"'>"+obj[x].cname+"</option>");
		}
	});
});


</script>
</head>
<body>
	<form action="add"  method="post" enctype="multipart/form-data">
		名称：<input type="text" name="sname"><br/>
		性别：<input type="radio" name="sex" value="男" checked="checked">男
		<input type="radio" name="sex" value="女" >女<br/>
		图片：<input type="file" name="file"><br/>
		类型：<select id="cid" name="cid">
			<option value="">--请选择--</option>
		</select>
		<input type="submit" value="添加">
	
	
	</form>
</body>
</html>