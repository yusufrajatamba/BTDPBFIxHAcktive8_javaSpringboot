package com.belajar.restapi.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.belajar.restapi.entity.Product;


public interface ProductService {
	List<Product> getAllProducts();
	void saveProduct(Product product);
	Product getProductById(long id);
	void deleteProductById(long id);
	Page<Product> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection);
}
