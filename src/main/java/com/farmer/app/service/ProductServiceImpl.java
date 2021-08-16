package com.farmer.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.farmer.app.dao.ProductDaoRepository;
import com.farmer.app.model.Product;
@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	ProductDaoRepository prodDaoRepo;
	@Override
	public Product addNewproduct(Product product) {
		// TODO Auto-generated method stub
		return prodDaoRepo.save(product);
	}

}
