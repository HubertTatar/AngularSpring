<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false" language="java"
	contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
<title>Home</title>
</head>
<body>
	<h1>Angular</h1>
	<P>The time on the server is ${serverTime}.</P>
	<p>
		<a href="<c:url value="/productsMain" />">Products</a> 
		<a href="<c:url value="/noteWrangler" />">Note Wrangler</a>
	</p>
</body>
</html>
