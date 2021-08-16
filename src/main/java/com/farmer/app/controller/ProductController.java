package com.farmer.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.farmer.app.model.Product;

import com.farmer.app.service.ProductService;


@RestController
public class ProductController {
	@Autowired
	ProductService prodService;
	
	@RequestMapping(value="/product/ping",method=RequestMethod.GET)
	public String ping()
	{
		return "i am running";
	}
	
	@RequestMapping(value="/product/add",method=RequestMethod.POST)
	public Product createEmployee(@RequestBody Product product)
	{
		System.out.println("Adding Product details");
		return prodService.addNewproduct(product);
		
	}

}
