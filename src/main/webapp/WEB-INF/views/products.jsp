<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html ng-app="store">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="<c:url value="/resources/bootstrap-3.3.5-dist/css/bootstrap.min.css" />" />
<link rel="stylesheet" type="text/css" href="<c:url value="/resources/custom/css/custom.css" />" />
<title>Products</title>
</head>
<body ng-controller = 'StoreController as store' class="list-group">
	<div class="list-group">
		<div ng-repeat = "product in store.products | limitTo:3 | orderBy:'-price'" class="list-group-item">
			{{product.name}}
<ul class="img-thumbnails clearfix">
        <li class="small-image pull-left thumbnail" >
          <img ng-src="{{product.images[0].full}}">
        </li>
      </ul>
      <p>{{product.date | date:'yyyy-MM-dd @ HH:mm'}}</p>

      <section ng-controller="PanelController as panel">
        <ul class="nav nav-pills">
          <li ng-class="{active: panel.isSelected(1)}">
            <a href ng-click="panel.selectTab(1)">Description</a>
          </li>
          <li ng-class="{active: panel.isSelected(2)}">
            <a href ng-click="panel.selectTab(2)">Specification</a>
          </li>
          <li ng-class="{active: panel.isSelected(3)}">
            <a href ng-click="panel.selectTab(3)">Reviews</a>
          </li>
        </ul>

        <div class="panel" ng-show="panel.isSelected(1)">
          <h4>Description</h4>
          <p><blockquote> {{product.description | lowercase | limitTo:80}} </blockquote></p>
        </div>

        <div class="panel" ng-show="panel.isSelected(2)">
          <h4>Specifications</h4>
          <p> None yet </p>
        </div>

        <div class="panel" ng-show="panel.isSelected(3)">
          <ul>
            <h4>Reviews</h4>
            <li ng-repeat="review in product.reviews">
              <blockquote>
                <b>Stars: {{review.stars}}</b>
                {{review.body}}
                <cite>by: {{review.author}}, created on: {{review.createdOn | date}}</cite>
              </blockquote>
            </li>
          </ul>

              <form name="reviewForm" ng-controller="ReviewController as reviewCtrl" ng-submit="reviewForm.$valid && reviewCtrl.addReview(product)" novalidate>
                <blockquote>
                  <b>Stars: {{reviewCtrl.review.stars}}</b>
                  {{reviewCtrl.review.body}}
                  <cite class="clearfix">-by: {{reviewCtrl.review.author}}</cite>
                </blockquote>

                <fieldset>
                  <select ng-model="reviewCtrl.review.stars" required>
                    <option value="1">1 star</option>
                    <option value="2">2 stars</option>
                    <option value="3">3 stars</option>
                    <option value="4">4 stars</option>
                    <option value="5">5 stars</option>
                  </select>
                </fieldset>
                <fieldset>
                  <textarea ng-model="reviewCtrl.review.body" required>a</textarea>
                </fieldset>
                <fieldset>
                  <label>by:</label>
                  <input ng-model="reviewCtrl.review.author" type="email" required/>
                </fieldset>
                <div>reviewForm is {{reviewForm.$valid}}</div>

                <input type="submit" value="Submit" />
              </form>


        </div>
      </section>

      <button ng-show='store.product.canPurchase'> Add to cart </button>

    </div>
</div>

<script type="text/javascript" src="<c:url value="/resources/angular/angular.min.js" />"></script>
<script type="text/javascript" src="<c:url value="/resources/angular/app.js" />"></script>
</body>
</html>