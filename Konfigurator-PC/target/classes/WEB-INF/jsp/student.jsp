<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/includes.jsp"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Lista kart graficznych</title>
	<link rel="stylesheet" type="text/css" href="/WEB-INF/style.css">
	<style>
     	<%@ include file="style.css"%>
	</style>
</head>
<body>
<div id="logo">
	Konfigurator-PC
</div>
<div id="topbar">
    	
</div>
<div id="content">
Witaj na stronie Konfigurator-PC, umozliwiajacej skonfigurowanie zestawu komputerowego.
<br/>
<br/>
	<form:form action="graphicsCard.do" method="POST" commandName="graphicsCard">
		<table>
			<tr>
				<td>ID</td>
				<td><form:input path="Id" /></td>
			</tr>
			<tr>
				<td>Producent</td>
				<td><form:input path="Producer" /></td>
			</tr>
			<tr>
				<td>Nazwa</td>
				<td><form:input path="Name" /></td>
			</tr>
			<tr>
				<td>Cena</td>
				<td><form:input path="Price" /></td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="submit" name="action" value="Add" />
					<br/>
					<input type="submit" name="action" value="Edit" />
					<br/>
					<input type="submit" name="action" value="Delete" />
					<br/>
					<input type="submit" name="action" value="Search" />
					<br/>
				</td>
			</tr>
		</table>
	</form:form>
	<table border="1">
	<tr>
		<th>ID</th>
		<th>Producent</th>
		<th>Nazwa</th>
		<th>Cena</th>
	</tr>
	<c:forEach items="${graphicsCardList}" var="student">
		<tr>
			<td>${graphicsCard.Id}</td>
			<td>${graphicsCard.Producer}</td>
			<td>${graphicsCard.Name}</td>
			<td>${graphicsCard.Price}</td>
		</tr>
	</c:forEach>
</table>
</div>
<div id="footer">
	(c) Konfigurator-PC - Mateusz Jabłoński 2018.
</div>
<br>
</body>
</html>