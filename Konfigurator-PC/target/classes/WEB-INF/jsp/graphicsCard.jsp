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
	<img src="data:image/svg+xml;utf8;base64,PD94bWwgdmVyc2lvbj0iMS4wIiBlbmNvZGluZz0iaXNvLTg4NTktMSI/Pgo8IS0tIEdlbmVyYXRvcjogQWRvYmUgSWxsdXN0cmF0b3IgMTYuMC4wLCBTVkcgRXhwb3J0IFBsdWctSW4gLiBTVkcgVmVyc2lvbjogNi4wMCBCdWlsZCAwKSAgLS0+CjwhRE9DVFlQRSBzdmcgUFVCTElDICItLy9XM0MvL0RURCBTVkcgMS4xLy9FTiIgImh0dHA6Ly93d3cudzMub3JnL0dyYXBoaWNzL1NWRy8xLjEvRFREL3N2ZzExLmR0ZCI+CjxzdmcgeG1sbnM9Imh0dHA6Ly93d3cudzMub3JnLzIwMDAvc3ZnIiB4bWxuczp4bGluaz0iaHR0cDovL3d3dy53My5vcmcvMTk5OS94bGluayIgdmVyc2lvbj0iMS4xIiBpZD0iQ2FwYV8xIiB4PSIwcHgiIHk9IjBweCIgd2lkdGg9IjMycHgiIGhlaWdodD0iMzJweCIgdmlld0JveD0iMCAwIDEyNCAxMjQiIHN0eWxlPSJlbmFibGUtYmFja2dyb3VuZDpuZXcgMCAwIDEyNCAxMjQ7IiB4bWw6c3BhY2U9InByZXNlcnZlIj4KPGc+Cgk8cGF0aCBkPSJNMTEyLDZIMTJDNS40LDYsMCwxMS40LDAsMThzNS40LDEyLDEyLDEyaDEwMGM2LjYsMCwxMi01LjQsMTItMTJTMTE4LjYsNiwxMTIsNnoiIGZpbGw9IiNGRkZGRkYiLz4KCTxwYXRoIGQ9Ik0xMTIsNTBIMTJDNS40LDUwLDAsNTUuNCwwLDYyYzAsNi42LDUuNCwxMiwxMiwxMmgxMDBjNi42LDAsMTItNS40LDEyLTEyQzEyNCw1NS40LDExOC42LDUwLDExMiw1MHoiIGZpbGw9IiNGRkZGRkYiLz4KCTxwYXRoIGQ9Ik0xMTIsOTRIMTJjLTYuNiwwLTEyLDUuNC0xMiwxMnM1LjQsMTIsMTIsMTJoMTAwYzYuNiwwLDEyLTUuNCwxMi0xMlMxMTguNiw5NCwxMTIsOTR6IiBmaWxsPSIjRkZGRkZGIi8+CjwvZz4KPGc+CjwvZz4KPGc+CjwvZz4KPGc+CjwvZz4KPGc+CjwvZz4KPGc+CjwvZz4KPGc+CjwvZz4KPGc+CjwvZz4KPGc+CjwvZz4KPGc+CjwvZz4KPGc+CjwvZz4KPGc+CjwvZz4KPGc+CjwvZz4KPGc+CjwvZz4KPGc+CjwvZz4KPGc+CjwvZz4KPC9zdmc+Cg==" />
	<a href="index">Konfigurator-PC</a> 
</div>
<div id="topbar">
    	
</div>
<div id="content">
<h2>Lista kart graficznych</h2>
<br/>
	<form  action="<c:url value="/index" />" method="GET">
    	<input type="submit" name="action" value="Strona glowna" />
	</form>
	<br/>
	<br/>
	<br/>
	<form:form action="graphicsCard.do" method="POST" commandName="graphicsCard">
		<table style="text-align: left;">
			<tr>
				<td>ID</td>
				<td><form:input path="graphicsCardId" /></td>
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
	<c:forEach items="${graphicsCardList}" var="graphicsCard">
		<tr>
			<td>${graphicsCard.graphicsCardId}</td>
			<td>${graphicsCard.producer}</td>
			<td>${graphicsCard.name}</td>
			<td>${graphicsCard.price}</td>
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