package com.farmer.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.farmer.app.model.Product;

public interface ProductDaoRepository extends JpaRepository<Product, Integer>{

}
