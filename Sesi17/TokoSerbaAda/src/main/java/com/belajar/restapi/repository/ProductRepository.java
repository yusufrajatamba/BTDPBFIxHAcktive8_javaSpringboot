package com.belajar.restapi.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.belajar.restapi.entity.Product;



@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{

}
