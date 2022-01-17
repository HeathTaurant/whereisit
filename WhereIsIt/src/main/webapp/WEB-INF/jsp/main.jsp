<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transictional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>main page test</title>
</head>
<body>

	<h1>Main test page</h1>
	<h2>연결을 축하합니다.</h2>
	<ul>
	<li>test page</li>
	<button onclick="location='clothingWhere'">clothingWhere</button> 
	</ul>
 
<div>

		<h2>DB 연동 확인</h2>
		<table border="1">
			<thead>
				<tr>
					<th>마지막 접속 시간</th>
					<th>현재 시간</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${mainList}" var="DBCheck">
					<tr>
						<th><input type="text" id="DBC_LASTCON" name="DBC_LASTCON"
							value="${DBCheck.DBC_LASTCON}"></th>
						<th><input type="text" id="DBC_NOWTIME" name="DBC_NOWTIME"
							value="${DBCheck.DBC_NOWTIME}"></th>
					</tr>
				</c:forEach>
			</tbody>
		</table>

	</div>
 
</body>
</html>