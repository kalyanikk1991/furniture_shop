<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
   	<%@ page isELIgnored="false"%> 


<h1 class="my-4">Shop Name</h1>
          <div class="list-group">
          
          <%-- <c:forEach items="${Categories}" var="category">
          <a href="${contextRoot}/show/category/${category.id}/products" class="list-group-item">${category.name}</a>
          </c:forEach> --%>
          
          <c:forEach items="${Categories}" var="category">
          <a href="${contextRoot}/show/category/${category.id}/products" class="list-group-item" id="a_${category.name}">${category.name}</a>
          </c:forEach>
            
            
           <!--  <a href="#" class="list-group-item">Category 2</a>
            <a href="#" class="list-group-item">Category 3</a> -->
          </div>