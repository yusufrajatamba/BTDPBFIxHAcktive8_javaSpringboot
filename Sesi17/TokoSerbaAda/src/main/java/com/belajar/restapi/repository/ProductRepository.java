package com.belajar.restapi.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.belajar.restapi.entity.Product;


public interface ProductRepository extends JpaRepository<Product, Long> {
	List<Product> findAllByName(String name);

	Product findProductsById(Long id);

}
