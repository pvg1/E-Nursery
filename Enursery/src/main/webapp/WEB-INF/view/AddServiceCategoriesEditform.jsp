<!-- Add Service Categories Edit Form, Action-Admin -->

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
	background-image:url("");
	
}

form {
	display: inline-block;
	background:lightseagreen;
	padding-right:15px;
	padding-left:15px;
	padding-top:15px;
	padding-bottom:15px;
}

.row {
	margin-top:50%;
	margin-bottom:50%;
}

header {
	height: 72px;
	background-color: lightgreen;
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
   padding-top:5px;
   padding-left:5px;
   padding-right:5px;
   
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
.reg{
padding-top:30px;
padding-bottom:30px;
font-weight:bold;
}

.link{
margin-right:10px;
margin-left:10px;
}
h3{
color:black;
}
.heading{
font-size: 45px;
padding-right: 210px;
padding-left:410px;
}


</style>

<title>Add Plant Categories</title>
</head>
<body>
<header>
		<nav class="site-nav">
			<ul class="nav justify-content-center">
			
				<li  class="heading">Enursery </li>
				
				<ul class="nav nav-tabs justify-content-end space"><li class="nav-item"><a class="nav-link " aria-current="page"
					href="/adminhome">Home</a></li>
				<li class="nav-item"><a class="nav-link"
					href="/logout/${username}">Logout</a></li>
			</ul></ul>
		</nav>
	</header>
	
	<!-- Update the Service Catogories by Admin -->
	<h1>Add Plant Categories Edit Form</h1>
	<form:form action="/updated" method="POST" modelAttribute="serviceCategories">
	<table>
	 <tr><th> plant Id</th>
	    <td><form:input type="text" path="plantId" required="required" class="form-control"/></td>
	    <td><form:errors path="plantId"/> </td>
	</tr>
	<tr><th> Plant Name</th>
	    <td><form:input type="text" path="plantname" required="required" class="form-control"/></td>
	     <td><form:errors path="plantname" cssClass="bg-danger" /> </td>
	</tr>
	<tr><th> Plant Type</th>
	    <td><form:input type="text" path="planttype" required="required" class="form-control"/></td>
	    <td><form:errors path="planttype" cssClass="bg-danger"/> </td>
	    
	</tr>
	<tr><td><input type="submit" value="Update Changes" class="btn btn-success link"></td>
	<td><input type="reset" value="Reset" class="btn btn-danger link"></td>
	</tr>
	
	</table>
	</form:form>
</body>
</html>