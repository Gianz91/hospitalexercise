<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Physician List</title>
</head>
<body>
	<table>
		<c:forEach var="paziente" items="${patients}">
			<tr>
				<td>${paziente.name}</td>
				<td>${paziente.address}</td>
				<td>${paziente.phone}</td>
				<td colspan = "2"><a href="/patient/${paziente.ssn}">Show Patient</a></input></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>