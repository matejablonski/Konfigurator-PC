<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/includes.jsp"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Procesory</title>
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
<h2>Lista procesorow</h2>
<br/>
	<form action="<c:url value="/index" />" method="GET">
    	<input type="submit" name="action" value="Strona glowna" />
	</form>
	<br/>
	<br/>
	<br/>
	<form:form action="processor.do" method="POST" commandName="processor">
		<table style="text-align: left;">
			<tr>
				<td>ID</td>
				<td><form:input path="processorId" /></td>
			</tr>
			<tr>
				<td>Producent</td>
				<td><form:input path="producer" /></td>
			</tr>
			<tr>
				<td>Nazwa</td>
				<td><form:input path="name" /></td>
			</tr>
			<tr>
				<td>Cena</td>
				<td><form:input path="price" /></td>
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
		<th>Id</th>
		<th>Producent</th>
		<th>Nazwa</th>
		<th>Cena</th>
	</tr>
	<c:forEach items="${processorList}" var="processor">
		<tr>
			<td>${processor.processorId}</td>
			<td>${processor.producer}</td>
			<td>${processor.name}</td>
			<td>${processor.price}</td>
		</tr>
	</c:forEach>
</table>
</div>
<div id="footer">
	(c) Konfigurator-PC - Mateusz Jablonski 2018.
</div>
<br>
</body>
</html>