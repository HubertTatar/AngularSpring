(function() {
  var app = angular.module('store', ["store-directives"]);
  var productsWebservice = "http://localhost:8080/myapp/products";

  app.controller("StoreController", [ '$http', function($http){
	  	var store = this;
	  	store.products = [];
	    
	    $http.get(productsWebservice).success(function(data){
	    	store.products = data;
	    });
	  }]);
  
})();