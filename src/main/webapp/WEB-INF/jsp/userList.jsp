<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>用户信息</title>
</head>
<body>
	<table border="1" align="center" width="50%">
		<tr>
			<th>ID</th>
			<th>Name</th>
			<th>Age</th>
		</tr>
		<c:forEach items="${users }" var="user">
			<tr>
				<td align="center">${user.id }</td>
				<td align="center">${user.name }</td>
				<td align="center">${user.age }</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>