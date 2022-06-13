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
	background: lightseagreen;
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
	background-color: rgb(144,238,144);
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
	background-color: rgb(144,238,144);
	color: white;
	text-align: center;
	position: absolute;
	bottom: 0;
	width: 100%;
	height: 30px
}
</style>

<title>Login...</title>
</head>
<body>
	<header>
		<nav class="site-nav">
			<ul class="nav justify-content-center">
				
				<li class="heading">Enursery</li>

				<ul class="nav nav-tabs justify-content-end space">
					<li class="nav-item"><a class="nav-link " aria-current="page"
						href="/">Home</a></li>
					<li class="nav-item"><a class="nav-link" href="About">About us</a></li>
					<li class="nav-item"><a class="nav-link  active"
						href="loginpage">Login</a></li>
					<li class="nav-item"><a class="nav-link"
						href="userregisterpage">Register</a></li>
				</ul>
			</ul>
		</nav>
	</header>


	<!-- Option value shown here for the type of user and modelattribute "login" -->
	<div>
		<form:form method="post" action="/login" modelAttribute="login">
			<table>
				<tr>
					<h2>Login</h2>
				</tr>
				<tr>
					<td>USER Type:</td>
					<td><form:select path="type" class="form-select" aria-label="Default select example">
							<option value="admin">Admin</option>
							<option value="user">User</option>
							<option value="service ">Nursery</option>
						</form:select></td>
				</tr>
				
				<!-- Login part -->
				<tr>
					<td>UserName:</td>
					<td><form:input path="username" type="text"
							required="required" class="form-control" /></td>
				</tr>
				<tr>
					<td>Password:</td>
					<td><form:input path="password" type="password"
							required="required" class="form-control"
							aria-describedby="passwordHelpBlock" /></td>
				</tr>
				
			<!-- By clicking the button it will redirect to adminhome, 
			servicehome and userhome based on the action after the validation  -->
				<tr>
					<td colspan=2><input type="submit" value="Login"
						class="btn btn-success link" /></td>
				
						<td colspan=2><a href="/forgot" class="btn btn-info link"> Forgot Password?  </a></td>
				</tr>
			</table>
			<div>${msg}</div>
		</form:form>
	</div>
	<footer>
		<h5>@ Enursery Ltd | AllRight Reserved</h5>
	</footer>
</body>
</html>