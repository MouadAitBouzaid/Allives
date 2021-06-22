<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<style>
body {
  background-image: url('file:///Users/cocobird/Downloads/images%20JEE/variety-of-olive-oils-with-copy-space-background.jpg');
  background-repeat: no-repeat;
  background-attachment: fixed;
  background-size: cover;
}
</style>
<meta http-equiv="Content-type" content="text/html; charset=ISO-8859-1">
<title>Articles</title>
<link  type='text/css' href='css/bootstrap.min.css' rel= 'stylesheet' >

</head>
<body>
<c:if test="${!empty sessionScope.roles}">
			<% 
			if("admin".equals(session.getAttribute("roles"))) {
				%> 
				<%@ include file="header.jsp" %>
	<% 	}else{
		%>	
		<%@ include file="headeruser.jsp" %>
		
		<% }
			%>
		<p class="text-center" style="color:white;"> Vous etes bien connecté ${sessionScope.names} !</p>
				</c:if>
<p> </p>
<div class="container">
<div class="panel panel-primary">
	<div class="panel-heading" >Cathalogue</div>
		<div class="panel-body">
		
		
		<table class="table">
			
			<tr>
			
				<th>Libelle</th><th>Type</th><th>Prix</th><th>image</th>
			</tr>
			<c:forEach items="${model.articles}" var="p"> 
				<tr> 
					<td>${p.libelle}</td>
					<td>${p.type}</td>
					<td>${p.prixunit} DH</td>
					<td><img src="${p.image}" alt="image" height="142" width="142"> </td>
			
					<td><a href="commande.do?id=${p.id}">Commander</a></td>
					
				</tr>
				</c:forEach>
		</table> 
		</div>
		</div>
</div>
</body> 
</html>