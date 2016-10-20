<%@ page language="java" contentType="text/html; charset=US-ASCII"
	pageEncoding="US-ASCII"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<title>Beer Recommendations</title>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
</head>

<c:set var="root" value="${request.contextPath}/" />

<body>
	<h1 align="center">Beer Recommendations JSP</h1>
	<c:if test="${fn:length(beers) == 0}">
		<p>
			<c:out value="Beers not found for given type" />
		<p />
	</c:if>
	<c:if test="${not empty beers}">
		<p>
			<c:forEach items="${beers}" var="beer">
				<br />
				<c:out value="${beer.name} - ${beer.brewery}" />
			</c:forEach>
		</p>
	</c:if>
	<a href="<c:url value="${root}"/>">Back Home</a>
</body>
</html>