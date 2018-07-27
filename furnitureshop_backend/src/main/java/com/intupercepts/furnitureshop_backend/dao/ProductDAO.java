package com.intupercepts.furnitureshop_backend.dao;

import java.util.List;

import com.intupercepts.furnitureshop_backend.dto.Category;
import com.intupercepts.furnitureshop_backend.dto.Product;

public interface ProductDAO {
	

	Product get(int productId);
	List<Product> list();
	boolean add(Product product);
	boolean update(Product product);
	boolean delete(Product product);
	
	//business methods
	List<Product> listActiveProducts();
	List<Product> listActiveProductsByCaegory(int categoryId);
	List<Product> getLatestActiveProducts(int count);
	

}