<!-- Register page by using the link in index page -->


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
	background: lightgreen;
	padding-right: 10px;
}

.row {
	margin-top: 50%;
	margin-bottom: 50%;
}

header {
	height: 72px;
	background-color:lightseagreen;
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
	background-color: lightseagreen;
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

h4 {
	color: navy-blue;
}

.heading {
	font-size: 45px;
	padding-right: 210px;
	padding-left: 410px;
}
</style>

<!-- Navigation -->
<title>User Register Form</title>
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
					<li class="nav-item"><a class="nav-link" href="loginpage">Login</a></li>
					<li class="nav-item"><a class="nav-link active"
						href="userregisterpage">Register</a></li>
				</ul>
			</ul>
		</nav>
	</header>
	<div class="reg">

		<!-- Admin register link provided here, it will redirect to adminregisterpage
		and Service provider registration is provided here, it will redirect to serviceregisterpage  -->
		
		Register as: <a href="/adminregisterpage"
			class="btn btn-outline-dark link"> Admin </a><a
			href="/serviceregisterpage" class="btn btn-outline-dark link">Nursery</a>
	</div>
	<br>
	
	<!-- User registration and modelAtttribute is set to "user"-->
	<form:form method="POST" action="/userregister" modelAttribute="user">
		<table>
			<tr>
				<th colspan=2><h4>Please fill in this form to create an
						User account.</h4>
				<th>
			</tr>
			<tr>
				<th>First Name:</th>
				<td><form:input type="text" path="firstname" required="required"
						class="form-control" /></td>
				<td><form:errors path="firstname" cssClass="bg-danger" /></td>
			</tr>

			<tr>
				<th>Last Name:</th>
				<td><form:input type="text" path="lastname" required="required"
						class="form-control" /></td>
				<td><form:errors path="lastname" cssClass="bg-danger" /></td>
			</tr>
			<tr>
				<th>Date of Birth:</th>
				<td><form:input type="Date" path="dob" required="required" min='1955-01-01'  max='2004-01-01'
				class="form-control" /></td>
				<td><form:errors path="dob" required="required" cssClass="bg-danger" /></td>
			</tr>
			<tr>
				<th>Email:</th>
				<td><form:input type="text" path="email" required="required"
						class="form-control" /></td>
				<td><form:errors path="email" cssClass="bg-danger" /></td>
			</tr>
				<th>Contact Number</th>
				<td><form:input type="tel" path="number" required="required"
						title="Must contain 10 digits" class="form-control" /></td>
				<td><form:errors path="number" cssClass="bg-danger" /></td>
			</tr>
			<tr>
				<th>Username:</th>
				<td><form:input type="text" path="username"
						placeholder="Enter Username" required="required" class="form-control" /></td>
				<td><form:errors path="username" cssClass="bg-danger" />${avail}</td>
			</tr>
			<tr>
				<th>Password:</th>
				<td><form:input type="password" path="password" 
						placeholder="Enter Password" required="required" class="form-control" /></td>
				<td><form:errors path="password"  cssClass="bg-danger"/></td>
			</tr>
			<tr>
				<th>Address:</th>
				<td><form:input type="text" path="address" required="required" class="form-control" /></td>
				<td><form:errors path="address" cssClass="bg-danger" /></td>
			</tr>
			<!-- By clicking the button it will redirect to loginpage after the validation  -->
			<tr>
				<td colspan="2"><input type="submit" value="Register"
					class="btn btn-success link"> <input type="reset"
					value="Reset" class="btn btn btn-danger link"></td>
			</tr>
		</table>
	</form:form>
	<footer>
		<h5>@ Enursery Ltd | AllRight Reserved</h5>
	</footer>
</body>
</html>