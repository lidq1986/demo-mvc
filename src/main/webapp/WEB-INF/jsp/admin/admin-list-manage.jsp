<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path;
%>
<!DOCTYPE html>
<html>
<head>
	<table id="table" border="1">
		<thead>
			<tr class="text-c">
				<th>序号</th>
				<th>登录名</th>
				<th>用户名</th>
				<th>手机号</th>
				<th>邮箱</th>
				<th>操作</th>
			</tr>
		</thead>
		<tbody>
			<c:if test="${not empty user}">
				<c:forEach items="${user}" var="user">
					<tr>
						<td>${user.user_ID}</td>
						<td>${user.userName}</td>
						<td>${user.password}</td>
						<td>${user.name}</td>
						<td>${user.email}</td>
						<td>
							<a href="#" onclick="alert('新增');">新增</a>
							<a href="#" onclick="alert('修改');">修改</a>
							<a href="admin/admin-delete" onclick="alert('删除');">删除</a>
						</td>
					</tr>
				</c:forEach>
			</c:if>
		</tbody>
	</table>

</head>
<body>



</body>
</html>