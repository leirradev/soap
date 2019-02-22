package com.helelshahar.soapdemo.business;

import java.util.ArrayList;
import java.util.List;

import com.helelshahar.soapdemo.model.Product;

public class ProductServiceImpl {
	List<String> bookList = new ArrayList<>();
	List<String> musicList = new ArrayList<>();
	List<String> movieList = new ArrayList<>();

	public ProductServiceImpl() {
		bookList.add("Inferno");
		bookList.add("JoyLand");
		bookList.add("The Game of Thrones");

		musicList.add("Random Access Memories");
		musicList.add("Night Vissions");
		musicList.add("Unorthodox Jukebox");

		movieList.add("Oz the Great and Powerful");
		movieList.add("Despicable Me");
		movieList.add("Star Trek into Darkness");
	}

	public boolean addProduct(String category, String product) {
		switch (category.toLowerCase()) {
		case "books":
			bookList.add(product);
			break;
		case "music":
			musicList.add(product);
			break;
		case "movies":
			movieList.add(product);
			break;
		}
		return true;
	}

	public List<String> getProducts(String category) {
		switch (category.toLowerCase()) {
		case "books":
			return bookList;
		case "music":
			return musicList;
		case "movies":
			return movieList;
		}
		return null;
	}

	public List<String> getProductCategories() {
		List<String> categories = new ArrayList<>();
		categories.add("Books");
		categories.add("Music");
		categories.add("Movies");
		return categories;
	}

	public List<Product> getProductsv2(String category) {
		// TODO Auto-generated method stub
		List<Product> productList = new ArrayList<>();
		productList.add(new Product("Java Brains Book","1234",999999.99));
		productList.add(new Product("Another Book","ABC",12.50));
		return productList;
	}

}
