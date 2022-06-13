<!-- Admin Home have three actions approve the service providers,
add service categories and view categories provided-->

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
	
	
}

form {
	display: inline-block;
	margin-top:10%;
	margin-bottom:10%;
	padding:20px;
	background:rgba(62, 190, 45, 0.5);
}
.link{
margin-top:30px;
margin-bottom:30px;
}
td{
font-weight:bold;
}

.row {
	margin-top:50%;
	margin-bottom:50%;
}

header {
	height: 72px;
	background-color: lightgreen;
}
table{
	display: inline-block;
	background:lightseagreen;
	padding-right:50px;
	padding-left:50px;
	
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
.heading{
font-size: 45px;
padding-right: 210px;
padding-left:410px;
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

<title>Admin Home Page</title>
</head>
<body>
	<header>
		<nav class="site-nav">
			<ul class="nav justify-content-center">
			
				<li  class="heading">Enursery</li>
				
				<ul class="nav nav-tabs justify-content-end space"><li class="nav-item"><a class="nav-link " aria-current="page"
					href="/">Home</a></li>
				
				<li class="nav-item"><a class="nav-link  active"
					href="loginpage">Login</a></li>
				<li class="nav-item"><a class="nav-link"
					href="/logout/${username}">Logout</a></li>
			</ul></ul>
		</nav>
	</header>
<h3> Hello, ${username} You are Admin .</h3><br>

<table>
<tr>
<th></th>
<!-- Approve or Delete Action-Admin Controller -->
<td><a href="/approve" class="btn btn-info link">Approve Nursery Requests</a></td>
</tr>
<tr>
<th></th>

<td><a href="/addservicecategories" class="btn btn-info link">  Add Plant Categories</a></td>
</tr>
<tr>
<th></th>

<td><a href="/categoriesProvided" class="btn btn-info link"> Manage plant Categories  </a></td>
</tr>
<tr>
	<th></th>
	
	<td><a href="/plant_articles" class="btn btn-info link"> Latest articles    </a></td>
	</tr>

</table>
<footer>
		<h5>@ Enursery Ltd | AllRight Reserved</h5>
	</footer>
</body>
</html>