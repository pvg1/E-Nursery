
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


form {
	display: inline-block;
	background:rgba(92,151,191,0.5);
	padding-right:20px;
	padding-left:20px;
	padding-top:20px;
	padding-bottom:20px;
}

.row {
	margin-top:50%;
	margin-bottom:50%;
}

header {
	height: 72px;
	background-color: skyblue;
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
	background-color: skyblue;
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
h1{
color:black;
}
.heading{
font-size: 45px;
padding-right: 210px;
padding-left:410px;
}


</style>


</head>
<body>
<header>
		<nav class="site-nav">
			<ul class="nav justify-content-center">
			<li><img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQY1pyZLbxExpjoz8ioHkUGcqxMHEAAWkmoLA&usqp=CAU"
					height=65px, width=80px id="logo"></li>
				<li  class="heading">Enursery</li>
				
				<ul class="nav nav-tabs justify-content-end space"><li class="nav-item"><a class="nav-link " aria-current="page"
					href="/adminhome">Home</a></li>
				<li class="nav-item"><a class="nav-link"
					href="/logout/${username}">Logout</a></li>
			</ul></ul>
		</nav>
	</header>
 
	<h1>Manage profile</h1>
	<form:form >
	<table>
	
	<tr><th> First Name:</th>
	    <td><form:select path="firstName" path="FirstName" required="required" class="form-control"/></td>
        <td><form:errors path="dob" cssClass="bg-danger" /> </td>
    </tr>
	<tr><th> Last Name:</th>
	    <td><form:select path="lastName" path="LastName" required="required" class="form-control"/></td>
        <td><form:errors path="dob" cssClass="bg-danger" /> </td>
	</tr>
	<tr><th> DOB:</th>
	    <td><form:input type="String" path="dob" required="required" class="form-control"/></td>
	    <td><form:errors path="dob" cssClass="bg-danger" /> </td>
	</tr>
	<tr><th> Gender:</th>
	    <td><form:input type="String" path="gender" required="required" class="form-control"/></td>
	    <td><form:errors path="gender" cssClass="bg-danger"/> </td>
	</tr>
	<tr><th> Contact Number:</th>
	    <td><form:input type="String" path="contactNumber" required="required" class="form-control"/></td>
	    <td><form:errors path="contactNumber" cssClass="bg-danger" /> </td>
	
	</tr><tr><th> User Id:</th>
	    <td><form:input type="String" path="username" required="required" class="form-control"/></td>
	    <td><form:errors path="username" cssClass="bg-danger" /> </td>
	
	</tr>
    <tr><th> Password:</th>
	    <td><form:input type="String" path="password" required="required" class="form-control"/></td>
	    <td><form:errors path="password" cssClass="bg-danger" /> </td>
	
	</tr><tr><th> Address:</th>
	    <td><form:input type="String" path="address" required="required" class="form-control"/></td>
	    <td><form:errors path="address" cssClass="bg-danger" /> </td>
	
	</tr>
	<tr><td><input type="submit" value="Update Changes" class="btn btn-success link"></td>
	<td><input type="reset" value="Reset" class="btn btn btn-danger link"></td>
	</tr>
	
	</table>
	</form:form>
	  <footer>
		<h5>@ Enursery Ltd | AllRight Reserved</h5>
	</footer>
</body>
</html>