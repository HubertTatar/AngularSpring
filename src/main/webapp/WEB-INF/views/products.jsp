<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html ng-app="store">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css"
	href="<c:url value="/resources/bootstrap-3.3.5-dist/css/bootstrap.min.css" />" />
<link rel="stylesheet" type="text/css"
	href="<c:url value="/resources/custom/css/custom.css" />" />
<title>Products</title>
</head>
<body ng-controller='StoreController as store' class="list-group">
	<div class="container">
		<div class="list-group">
			<div ng-repeat="product in store.products | limitTo:3 | orderBy:'-price'"
				class="list-group-item">
				{{product.name}}
				
				<product-gallery></product-gallery>
					
				<p>{{product.date | date:'yyyy-MM-dd @ HH:mm'}}</p>

				<product-tabs></product-tabs>
			
				<button ng-show='store.product.canPurchase'>Add to cart</button>

			</div>
		</div>
	</div>
	<script type="text/javascript" src="<c:url value="/resources/angular/angular.min.js" />"></script>
	<script type="text/javascript" src="<c:url value="/resources/angular/app.js" />"></script>
	<script type="text/javascript" src="<c:url value="/resources/angular/directives/products/products.js" />"></script>
</body>
</html>