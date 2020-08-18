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
</head>
<body>
	<table>
		<tr>
			<form action="list" method="post">
				姓名：<input type="text" name="sname">
				<input type="submit" value="搜素">
			</form>
		</tr>
		<tr>
			<td>编码</td>
			<td>姓名</td>
			<td>性别</td>
			<td>图片</td>
			<td>类型</td>
			<td>操作</td>
		</tr>
		<c:forEach items="${page.list }" var="s">
		<tr>
			<td>${s.sid }</td>
			<td>${s.sname }</td>
			<td>${s.sex }</td>
			<td>
			<img alt="xxx" src="lookImg?path=${s.picurl }" height="100px" width="100px">
			</td>
			<td>${s.cname }</td>
			<td>
				<a href="add.jsp">添加</a>
				<a href="del?sid=${s.sid }">删除</a>
				<a href="findById?sid=${s.sid }">修改</a>
			</td>
		</tr>
		</c:forEach>
		<tr>
			<td colspan="10">
				<a href="list?pageNum=1">首页</a>
				<a href="list?pageNum=${page.pageNum -1 }">上一页</a>
				<a href="list?pageNum=${page.pageNum +1 }">下一页</a>
				<a href="list?pageNum=${page.pages }">尾页</a>
			</td>
		</tr>
	</table>
</body>
</html>