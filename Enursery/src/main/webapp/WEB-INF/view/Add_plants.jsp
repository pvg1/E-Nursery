<!-- Login page is shown only after the validaition in RegisterController is successful  -->

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
	align: center;
	background-image:
		url("");
}

form {
	display: inline-block;
	margin-top: 10%;
	margin-bottom: 10%;
	padding: 20px;
	background: lightgreen;
}

td {
	font-weight: bold;
}

.row {
	margin-top: 50%;
	margin-bottom: 50%;
}

header {
	height: 72px;
	background-color:lightgreen;
}

table {
	borer-spacing: 0 5px;
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

.heading {
	font-size: 45px;
	padding-right: 210px;
	padding-left: 410px;
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
</style>
<header>

	<nav class="site-nav">
		<ul class="nav justify-content-center">
		
			<li  class="heading">LATEST ARTICLES</li>
			
			<ul class="nav nav-tabs justify-content-end space"><li class="nav-item"><a class="nav-link " aria-current="page"
				href="/">Home</a></li>
			
			<li class="nav-item"><a class="nav-link"
				href="/logout/${username}">Logout</a></li>
			
		</ul></ul>
	</nav>
</header>
<title>LATEST PLANT ARTICLES </title>
</head>
<body>
<table>
	<tr>
		<td>
			<marquee width="60%" direction="right" height="100px"> 
				<a href="https://www.cell.com/trends/plant-science/newarticles" >Latest trendes in plant science</a> </marquee>

				<marquee width="60%" direction="right" height="100px"> 
					<a href="https://ieeexplore.ieee.org/document/9445277" >Seedles fruits plant study by WHO</a> </marquee>
					<marquee width="60%" direction="right" height="100px"> 
						<a href="https://ieeexplore.ieee.org/document/9445277" >Plant disease detection by deep learning </a> </marquee>
						<marquee width="60%" direction="right" height="100px"> 
							<a href="https://www.cell.com/trends/plant-science/newarticles" >contribution of machine learning the agriculture </a> </marquee>
							<marquee width="60%" direction="right" height="100px"> 
								<a href="https://www.cell.com/trends/plant-science/newarticles" >Technology for the greater productivity in plants</a> </marquee>
		</td>
	</tr>
	
</table>


	
			
				
	
	<footer>
		<h5>@ Enursery Ltd | AllRight Reserved</h5>
	</footer>
</body>
</html>