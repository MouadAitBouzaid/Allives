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
<title>Ma commande</title>
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
		<p class="text-center"> Vous etes bien connecté ${sessionScope.names} !</p>
				</c:if>
<p> </p>
<div class="container">
<div class="panel panel-primary">
	<div class="panel-heading" >Mes commandes</div>
		<div class="panel-body">
		
		<table class="table">
			
			<c:forEach items="${commandes}" var="p"> 
				<tr> 
					<td>${p.idc}</td>
					<td>${p.datecommande}</td>
					<td>${p.etat}</td>
					<td>${p.modeliv}</td>
					<td>${p.totprix}</td>
					<td><a href="supprimecommande.do?idc=${p.idc}">Supprimer</a></td>
	
				</tr>
				</c:forEach>
		</table> 
		</div>
		</div>
</div>
</body> 
</html>