package com.mycompany.myapp.products.model;

import java.util.Date;
import java.util.List;
import java.util.Map;

public class Product {
	private String name;
	private Double price;
	private String description;
	private Boolean canPurchase;
	private Boolean solOut;
	private Date date;
	private Map<String, String> images;
	private List<Review> reviews;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Boolean getCanPurchase() {
		return canPurchase;
	}
	public void setCanPurchase(Boolean canPurchase) {
		this.canPurchase = canPurchase;
	}
	public Boolean getSolOut() {
		return solOut;
	}
	public void setSolOut(Boolean solOut) {
		this.solOut = solOut;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Map<String, String> getImages() {
		return images;
	}
	public void setImages(Map<String, String> images) {
		this.images = images;
	}
	public List<Review> getReviews() {
		return reviews;
	}
	public void setReviews(List<Review> reviews) {
		this.reviews = reviews;
	} 
	
	
}
