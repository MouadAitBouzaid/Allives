<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-type" content="text/html; charset=ISO-8859-1">
<title>Articles</title>
<link  type='text/css' href='css/bootstrap.min.css' rel= 'stylesheet' >

</head>
<body>
<%@ include file="header.jsp" %>
<p> </p>		
		
		<% session.invalidate(); %>

	<c:redirect url = "login.jsp"/>


</body> 
</html>