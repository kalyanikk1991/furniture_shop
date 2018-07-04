<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%-- <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
   	<%@ page isELIgnored="false"%> --%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>

    <spring:url var="css" value="/resources/css" />
    <spring:url var="js" value="/resources/js" />
    <spring:url var="images" value="/resources/images" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<link href="${css}/custom.css" type="text/css" rel="stylesheet">

<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

</head>
<body>
	message:${greeting}


	<div class="header">
		<h1>Furniture Shop</h1>
		<div id="small-heading">
			<h5>
				Your Choice.Your Store.
				<h5>
		</div>
	</div>

	<div class="nav-bar">
		<div class="menu">
			<ul>
				<li><a href="#home">Home</a></li>
				<li><a href="#Products">Products</a></li>
				<li><a href="#aboutUs">About Us</a></li>
				<li><a href="#Cart"><i class="fa fa-shopping-cart"
						aria-hidden="true"></i></a></li>
				<li><a href="../furniture store/login.html"><i
						class="fa fa-user" aria-hidden="true"></i></a></li>

			</ul>
		</div>

		<div class="my-container">
			<img src="${images}/image1.jpg" alt="hall">

		</div>


	</div>



</body>
</html>