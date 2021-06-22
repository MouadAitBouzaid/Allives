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
	<div class="panel-heading" >Confirmation</div>
		<div class="panel-body">
			<form action="saisie.jsp">
		
		<div class="form-group">
			<label>ID</label>
			<label>${article.id}</label>
		</div>
		
		<div class="form-group">
			<label>Libelle</label>
			<label>${article.libelle}</label>
		</div>
		
		<div class="form-group">
			<label>Prix Unitaire</label>
			<label>${article.prixunit}</label>
		</div>
		
		<div class="form-group">
			<label>Type</label>
			<label>${article.type}</label>
		</div>
		
				<button type="submit" class="btn btn-primary">Confirmer</button>
			</form>
		</div>
		</div>
</div>
</body> 
</html>