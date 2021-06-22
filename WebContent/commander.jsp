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
		<p class="text-center"> Vous etes bien connecté ${sessionScope.roles} !</p>
				</c:if>
<p> </p>
<div class="container">
<div class="panel panel-primary">
	<div class="panel-heading" >Recherche des articles</div>
		<div class="panel-body">
		
		<table class="table">
			
			<tr>
				<th><input type="text" name="prix" value=${prix}></th>
			</tr>
			<tr> 
				<td>Quantité: </td>
				<td><FORM>
					<SELECT name="quantite" size="1">
						<OPTION>1
						<OPTION>2
						<OPTION>3
						<OPTION>4
						<OPTION>5
						<OPTION>6
						<OPTION>7
					</SELECT>
				</FORM>	
				</td>
			</tr>
			<tr>
			<td>Mode livraison: </td>
			<td>
				<FORM>
					<SELECT name="modeliv" size="1">
						<OPTION>Sur place
						<OPTION>A domicile
					</SELECT>
				</FORM>
			</td>	
			</tr>
			<tr>
			<td><label for="date">date de commande:</label></td>

			<td><input type="text" name="date" value="2021-07-22"></td>
			
			</tr>
			<tr>
				<td></td>
				<td><form action="commandeconf.do" method="post"
				
				><button type="submit" class="btn btn-primary">Confirmer</button>
				
				</form>
				</td>
			</tr>
			
				
		</table> 
		</div>
		</div>
</div>
</body> 
</html>