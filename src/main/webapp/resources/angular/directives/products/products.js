(function() {
	
  var app = angular.module('store-directives',[]);
  var resourcePath = '/myapp/resources/angular/directives/products/';	
  
  app.directive('productGallery', function(){
	  return {
		  restrict: 'E',
		  templateUrl: resourcePath + 'product-gallery.html'
	  };
  });
  
  app.directive('productTabs',function(){
	  return {
		  restrict: 'E',
		  templateUrl: resourcePath + 'product-tabs.html',
		  controller: function(){
			  this.tab = 1;
			  
			  this.selectTab = function(setTab){
				    this.tab = setTab;
				  };

			  this.isSelected = function(checkTab){
				    return this.tab === checkTab;
			  };			  
		  },
		  controllerAs: 'tab'
	  }
  });
  
  app.directive('productDescription', function(){
	    return {
	      restrict: 'E',
	      templateUrl: resourcePath + 'product-description.html'
	    };
  });  
  
  app.directive('productSpecification', function(){
	    return {
	      restrict: 'E',
	      templateUrl: resourcePath + 'product-specification.html'
	    };
  });
  
  app.directive('productReview', function(){
	  return {
		  restrict: 'E',
		  templateUrl: resourcePath + 'product-review.html',
		  controller: function(){
			    this.review = {};

			    this.addReview = function(product){
			      this.review.createdOn = Date.now();
			      product.reviews.push(this.review);
			      this.review = {};
			    };			  
		  },
		  controllerAs: 'reviewCtrl'
	  };
  });
  
  
})();  