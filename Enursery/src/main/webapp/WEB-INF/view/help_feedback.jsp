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
	background: rgba(92, 151, 191, 0.5);
	padding-right: 15px;
	padding-left: 15px;
	padding-top: 15px;
	padding-bottom: 15px;
}

.row {
	margin-top: 50%;
	margin-bottom: 50%;
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
	padding-top: 5px;
	padding-left: 5px;
	padding-right: 5px;
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

.reg {
	padding-top: 30px;
	padding-bottom: 30px;
	font-weight: bold;
}

.link {
	margin-right: 10px;
	margin-left: 10px;
}

h3 {
	color: black;
}

.heading {
	font-size: 45px;
	padding-right: 210px;
	padding-left: 410px;
}
</style>

<title>Add Plant Categories</title>
</head>
<body>
	<header>
		<nav class="site-nav">
			<ul class="nav justify-content-center">
				<li><img
					src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQY1pyZLbxExpjoz8ioHkUGcqxMHEAAWkmoLA&usqp=CAU"
					height=65px, width=80px id="logo"></li>
				<li class="heading">Enursery</li>

				<ul class="nav nav-tabs justify-content-end space">
					<li class="nav-item"><a class="nav-link " aria-current="page"
						href="/userhome">Home</a></li>
					<li class="nav-item"><a class="nav-link"
						href="/logout/${username}">Logout</a></li>
				</ul>
			</ul>
		</nav>
	</header>
    <h2>Help and feedback</h2>
    <p>If any help needed please contact us on 9567853676</p>

        <div class="feedback">


            <h4>Please rate your service experience for the following parameters</h4>
            <form method="post" action="#action-url">
            <label>1. Your overall experience with us ?</label><br>
              
            <span class="star-rating">
              <input type="radio" name="rating1" value="1"><i></i>
              <input type="radio" name="rating1" value="2"><i></i>
              <input type="radio" name="rating1" value="3"><i></i>
              <input type="radio" name="rating1" value="4"><i></i>
              <input type="radio" name="rating1" value="5"><i></i>
            </span>
              <div class="clear"></div> 
              <hr class="survey-hr">
            
             
              <div class="clear"></div> 
              <hr class="survey-hr">
            <label>2.Comfortability of using our application </label><br><hr/>
              <div style="color:grey">
                <span style="float:left">
                 POOR
                </span>
                <span style="float:right">
                  BEST
                </span>
                
              </div>
            <span class="scale-rating">
              <label value="1">
              <input type="radio" name="rating" >
              <label style="width:100%;"></label>
              </label>
              <label value="2">
              <input type="radio" name="rating" >
              <label style="width:100%;"></label>
              </label>
              <label value="3">
              <input type="radio" name="rating">
              <label style="width:100%;"></label>
              </label>
              <label value="4">
              <input type="radio" name="rating">
              <label style="width:100%;"></label>
              </label>
              <label value="5">
              <input type="radio" name="rating">
              <label style="width:100%;"></label>
              </label>
              <label value="6">
              <input type="radio" name="rating">
              <label style="width:100%;"></label>
              </label>
              <label value="7">
              <input type="radio" name="rating">
              <label style="width:100%;"></label>
              </label>
              <label value="8">
              <input type="radio" name="rating">
              <label style="width:100%;"></label>
              </label>
              <label value="9">
              <input type="radio" name="rating">
              <label style="width:100%;"></label>
              </label>
              <label value="10">
              <input type="radio" name="rating" value="10">
              <label style="width:100%;"></label>
              </label>
            </span>
              <div class="clear"></div> 
              <hr class="survey-hr"> 
            <label for="m_3189847521540640526commentText">3. Any Other suggestions:</label><br/><br/>
            <textarea cols="75" name="commentText" rows="5" style="100%"></textarea><br>
            <br>
              <div class="clear"></div> 
            <input style="background:#43a7d5;color:#fff;padding:12px;border:0" type="submit" value="Submit your review"> 
            </form>
            </div>
    <footer>
		<h5>@ Enursery Ltd | AllRight Reserved</h5>
	</footer>
</body>
</html>