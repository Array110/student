<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div>
		<input type="text" name="search"><input type="button" value="查询">
	
	</div>
	<table border="1">
		<tr>
			<td>学生姓名</td>
			<td>性别</td>
			<td>所属学院</td>
			<td>入校日期</td>
			<td>当前宿舍</td>
			<td colspan="11">操作</td>
		</tr>
	<c:forEach items="${list}" var="l">
		<tr>
			<td>${l.name}</td>
			<td>${l.sex }</td>
			<td>${l.collage }</td>
			<td>${l.cdate }</td>
			<td>${l.chome}</td>
			<td><input type="button" value="跟换宿舍"></td>
			<td><input type="button" value="宿舍跟换记录"></td>
		</tr>
	</c:forEach>
	
	
	</table>


</body>
</html>