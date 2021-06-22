 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>
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
<div class="container col-md-8 col-md-offset-2 col-xs-12">
<div class="panel panel-primary">
	<div class="panel-heading" >Modification des articles</div>
		<div class="panel-body">
			<form action="updatearticle.do" method="POST">
				
				<div class="form-group"><label class="control-label">ID</label> 
				<input type="text" name="id" value="${article.id}" class="form-control"/>
				<span></span>
				</div>
				
				
				<div class="form-group">
				<label class="control-label">Libelle</label> 
				<input type="text" name="libelle" value="${article.libelle}"  class="form-control"/>
				<span></span>
				</div>
				
				
				<div class="form-group"><label class="control-label">Prix unitaire</label> 
				<input type="text" name="prix"  value="${article.prixunit}" class="form-control"/>
				<span></span>
				</div>
				
				<div class="form-group"><label class="control-label">Type</label> 
				<input type="text" name="type" value="${article.type}" class="form-control"/>
				<span></span>
				</div>
				
				<div class="form-group"><label class="control-label">URL image</label> 
				<input type="text" name="img" value="${article.image}" class="form-control"/>
				<span></span>
				</div>
				
				<div>
					<button type="submit" class="btn btn-primary">Enregistrer</button>
				</div>
				
				</form>
				
		</div>
		</div>
</div>
</body> 
</html>