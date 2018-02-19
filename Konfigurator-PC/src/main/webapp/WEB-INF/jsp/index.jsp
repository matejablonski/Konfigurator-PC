<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/includes.jsp"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Konfigurator-PC</title>
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
	<h2>Witaj na stronie Konfigurator-PC, umozliwiajacej skonfigurowanie zestawu komputerowego.</h2>
	<form action="<c:url value="/listaKart" />" method="GET">
    	<input type="submit" name="action" value="Karty graficzne" />
	</form>
	<form action="<c:url value="/listaProcesorow" />" method="GET">
    	<input type="submit" name="action" value="Procesory" />
	</form>
	<form action="<c:url value="/listaPamieci" />" method="GET">
    	<input type="submit" name="action" value="Uklady pamieci" />
	</form>
</div>
<br/>
<br/>

<div id="footer">
	(c) Konfigurator-PC - Mateusz Jablonski 2018.
</div>
<br>
</body>
</html>