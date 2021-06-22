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
		<p class="text-center" style="color:white;" > Vous etes bien connecté ${sessionScope.names} !</p>
				</c:if>

<p> </p>
<div class="container">
<div class="panel panel-primary">
	<div class="panel-heading" >Recherche des articles</div>
		<div class="panel-body">
		<form action="chercher.do" method="get">
			<label>Mot clé</label>
			<input type="text" name="motcle" value="${model.motcle}"/>
			<button type="submit" class="btn btn-primary"> chercher </button>
		</form>
		
		<table class="table">
			
			<tr>
			
				<th>ID</th><th>Libelle</th><th>Type</th><th>Prix</th>
			</tr>
			<c:forEach items="${model.articles}" var="p"> 
				<tr> 
					<td>${p.id}</td>
					<td>${p.libelle}</td>
					<td>${p.type}</td>
					<td>${p.prixunit}</td>
					<td><a onclick="return confirm('Etes vous sure de supprimer cette article ?')" href="supprime.do?id=${p.id}">Supprimer</a></td>
					<td><a href="edit.do?id=${p.id}">Modifier</a></td>
				</tr>
				</c:forEach>
		</table> 
		</div>
		</div>
</div>
</body> 
</html>