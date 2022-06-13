<!-- It shows the result vlaues for the user search(userhome) -->

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.6.0/dist/umd/popper.min.js"
	integrity="sha384-KsvD1yqQ1/1+IA7gi3P0tyJcT3vR+NdBTt13hSJ2lnve8agRGXTTyNaBYmCR/Nwi"
	crossorigin="anonymous"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/js/bootstrap.min.js"
	integrity="sha384-nsg8ua9HAw1y0W1btsyWgBklPnCUAFLuTMS2G72MMONqmOymq585AcH49TLBQObG"
	crossorigin="anonymous"></script>
<meta charset="ISO-8859-1">
<style>
body {
	text-align: center;
	background-image:
		url("");
}

form {
	display: inline-block;
	background: lightseagreen;
	padding-right: 15px;
	padding-left: 15px;
	padding-top: 15px;
	padding-bottom: 15px;
}

table {border ="10";width ="90%";cellpadding ="5";
	
}

.row {
	margin-top: 50%;
	margin-bottom: 50%;
}

header {
	height: 72px;
	background-color:lightgreen;
}

a {
	color: black;
	font-weight: bold;
	text-decoration: none;
}

.space {
	padding-top: 30px;
	padding-left: 10px;
	padding-right: 10px;
}

#logo {
	padding-top: 5px;
	padding-left: 5px;
	padding-right: 5px;
}

footer {
	background-color: lightgreen;
	color: white;
	text-align: center;
	position: absolute;
	bottom: 0;
	width: 100%;
	height: 30px
}

.reg {
	padding-top: 30px;
	padding-bottom: 30px;
	font-weight: bold;
}

.link {
	margin-right: 10px;
	margin-left: 10px;
}

h1 {
	color: black;
}

.heading {
	font-size: 45px;
	padding-right: 210px;
	padding-left: 410px;
}
</style>

<title>Search</title>
</head>
<body>
	<header>
		<nav class="site-nav">
			<ul class="nav justify-content-center">
				
				<li class="heading">Enursery</li>

				<ul class="nav nav-tabs justify-content-end space">
					<li class="nav-item"><a class="nav-link " aria-current="page"
						href="/">Home</a></li>

					<li class="nav-item"><a class="nav-link"
						href="/logout/${username}">Logout</a></li>

				</ul>
			</ul>
		</nav>
	</header>

<!-- Showing the Service details and redirected to address.jsp -->
	<h2>Plant search in Nursery</h2>
	<form:form>
		<table>
			<tr>
			     <th>nursery name</th>
			     <th>nursery number</th>
	
				<th>plantId</th>
				<th>plantname </th>
				<th> planttype</th>
				<th>season</th>
				<th>origin</th>
				<th>variety</th>
				<th>location</th>
				<th>More details<th>
			</tr>
			<c:forEach var="search" items="${slist}">
				<tr>
				<td>${search.name}</td>
				<td>${search.number}</td>
				
					<td>${search.plantId}</td>
					<td>${search.plantname}</td>
					<td>${search.planttype}</td>
					<td>${search.season}</td>
					<td>${search.origin}</td>
					<td>${search.variety}</td>
					<td>${search.location}</td>
					<td><a href="/address/${search.plantId}"  class="btn btn-success link">Click here</a></td>
				</tr>
			</c:forEach>
		</table>
	</form:form>
	<footer>
		<h5>@ Enursery Ltd | AllRight Reserved</h5>
	</footer>
</body>
</html>