<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=US-ASCII"
	pageEncoding="US-ASCII"%>
<%@ page import="java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Beer Recommender</title>
</head>
<body>

	<h1 align='center'>Beer Selection Page</h1>


	Select beer characteristics
	<p>
		<spring:url value="/beer/beerForm" var="beerFormActionUrl" />
		<form:form method="post" modelAttribute="beerData" action="${beerFormActionUrl}"
			focus="color">

			<form:select id="color" path="type">
				<form:option value="amber">Amber</form:option>
				<form:option value="bruin">Bruin</form:option>
				<form:option value="blond">Blond</form:option>
			</form:select>
			<br />
			<br />

			<center>
				<input type="submit" value="Select Beer Style" />
			</center>

		</form:form>
</body>
</html>