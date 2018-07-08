<!DOCTYPE html>
<html lang="en">
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
   	<%@ page isELIgnored="false"%> 

<c:set var="contextRoot" value="${pageContext.request.contextPath}"/>

    <spring:url var="css" value="/resources/css" />
    <spring:url var="js" value="/resources/js" />
    <spring:url var="images" value="/resources/images" />

  <head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Furniture Shop-${title}</title>
    
    <script>
		window.menu='${title}';
	</script>

    <!-- Bootstrap core CSS -->
    <link href="${css}/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="${css}/custom.css" rel="stylesheet">
    
    <%-- <%-- <!-- bootstrap theme  -->
    <link href="${css}/bootstrap-lux-theme.css" rel="stylesheet"> --%>
    
      <link href="${css}/bootstrap-standstone-theme.css" rel="stylesheet"> 
    
   <%--  <link href="${css}/bootstrap-simplex-theme.css" rel="stylesheet"> --%>
    
    <%-- <link href="${css}/bootstrap-lux-theme.css" rel="stylesheet">  --%>

  </head>

  <body>
   
   <div class="wrapper">

	 <!-- navigation bar comes here -->
    <%@include file="./shared/navbar.jsp" %>
    
    
	<!-- page content comes here -->
	
	<div class="content">
    <c:if test="${userClickHome==true}">
	<%@include file="home.jsp"%>
	</c:if>
	
	<c:if test="${userClickAbout==true}">
	<%@include file="about.jsp"%>
	</c:if>
	
	<c:if test="${userClickProduct==true}">
	<%@include file="product.jsp"%>
	</c:if>
	
	<c:if test="${userClickLogin==true}">
	<%@include file="contact.jsp"%>
	</c:if>

	</div>
	
	<!-- Footer comes here -->
   <%@include file="./shared/footer.jsp"%>
   
   
     <!-- Bootstrap core JavaScript -->
    <script src="${js}/jquery.min.js"></script>
    <script src="${js}/bootstrap.min.js"></script> 
    
    <!-- for active menu problem comes here -->
    <script src="${js}/myapp.js"></script>
    
    
	</div>
  </body>

</html>
