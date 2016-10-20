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
	<form action="/beer-app/BeerForm" method="POST" focus="color">

		<select>
			<option value="Amber">Amber</option>
			<option value="Brown">Brown</option>
			<option value="Blonde">Blonde</option>

		</select> <br /> <br />

		<center>
			<input type="submit" value="Select Beer Style" />
		</center>

	</form>

</body>
</html>