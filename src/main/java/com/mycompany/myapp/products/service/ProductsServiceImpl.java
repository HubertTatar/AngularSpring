package com.mycompany.myapp.products.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.mycompany.myapp.products.model.Product;
import com.mycompany.myapp.products.model.Review;

@Service
public class ProductsServiceImpl implements ProductService {

	@Override
	public List<Product> getProducts() {
		ArrayList<Product> list = new ArrayList<>();
		Product a = new Product();
		a.setName("Sapphire");
		a.setCanPurchase(Boolean.FALSE);
		a.setDate(new Date());
		a.setDescription("Like sapphire");
		Map<String, String> map = new HashMap<>();
		map.put("full", "image/dodecahedron-01-full.jpg");
		map.put("thumb", "image/dodecahedron-01-full.jpg");
		a.setImages(map);
		a.setPrice(4.33);
		List<Review> revies = new ArrayList<>();
		Review r1 = new Review();
		r1.setAuthor("joe@thomas.com");
		r1.setBody("I love this product");
		r1.setStars(5);
		r1.setCreatedOn(new Date());
		Review r2 = new Review();
		r2.setAuthor("tim@hater.com");
		r2.setBody("This product sucks");
		r2.setStars(1);
		r2.setCreatedOn(new Date());
		revies.add(r1);
		revies.add(r2);
		a.setReviews(revies);
		a.setSolOut(Boolean.FALSE);

		Product b = new Product();
		b.setName("Dodecahedron");
		b.setCanPurchase(Boolean.FALSE);
		b.setDate(new Date());
		b.setDescription("Gems, gems are truly outrageus.");
		Map<String, String> mapb = new HashMap<>();
		mapb.put("full", "image/dodecahedron-01-full.jpg");
		mapb.put("thumb", "image/dodecahedron-01-full.jpg");
		b.setImages(map);
		b.setPrice(44.33);

		b.setReviews(revies);
		b.setSolOut(Boolean.FALSE);

		Product c = new Product();
		c.setName("Pentagonal Gem");
		c.setCanPurchase(Boolean.FALSE);
		c.setDate(new Date());
		c.setDescription("Pentagonal gems are truly awesome!");
		Map<String, String> mapc = new HashMap<>();
		mapc.put("full", "image/dodecahedron-01-full.jpg");
		mapc.put("thumb", "image/dodecahedron-01-full.jpg");
		c.setImages(map);
		c.setPrice(2.65);
		
		c.setReviews(revies);
		c.setSolOut(Boolean.FALSE);

		Product d = new Product();
		d.setName("Ruby");
		d.setCanPurchase(Boolean.FALSE);
		d.setDate(new Date());
		d.setDescription("Smells like competitor");
		Map<String, String> mapd = new HashMap<>();
		mapd.put("full", "image/dodecahedron-01-full.jpg");
		mapd.put("thumb", "image/dodecahedron-01-full.jpg");
		d.setImages(map);
		d.setPrice(6.65);
		
		d.setReviews(revies);
		d.setSolOut(Boolean.FALSE);
		
		Product e = new Product();
		e.setName("Diamond");
		e.setCanPurchase(Boolean.FALSE);
		e.setDate(new Date());
		e.setDescription("Shine on crazy diamond.");
		Map<String, String> mape = new HashMap<>();
		mape.put("full", "image/dodecahedron-01-full.jpg");
		map.put("thumb", "image/dodecahedron-01-full.jpg");
		e.setImages(map);
		e.setPrice(6.66);
		
		e.setReviews(revies);
		e.setSolOut(Boolean.FALSE);
		
		list.add(a);
		list.add(b);
		list.add(c);
		list.add(d);
		list.add(e);
		return list;
	}

}
