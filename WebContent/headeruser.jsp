 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>
	<div class="navbar navbar-inverse"> 
		<ul class="nav navbar-nav">
	 	<c:if test="${!empty sessionScope.roles}">
		
		<li> <a href=cathalogue.do>Catalogue</a></li>
		<li> <a href=mescommandes.do>Mes Commandes</a></li>
		<li> <a href=logout.jsp>Logout</a></li>
		
		
		</c:if>
		<c:if test="${empty sessionScope.roles}">
		<li> <a href=cathalogue.do>Catalogue</a></li>
		<li> <a href=login.do>Login</a></li>
		<li> <a href=vregister.do>Register</a></li>
		</c:if> 
	
		</ul>
	</div>
