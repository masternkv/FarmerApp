package com.farmer.app.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.farmer.app.Exception.RecordNotFoundException;
import com.farmer.app.model.Farmer;
import com.farmer.app.service.FarmerService;


@RestController
@RequestMapping(value="/farmer")
public class FarmerController {
	@Autowired
	FarmerService farmerService;
	
	@GetMapping(value="/ping")
	public ResponseEntity<?> ping()
	{
	    boolean my=true;
		String message="I am running";
		if(!my)
		{
			return ResponseEntity.of(Optional.of(message));
		}
		else
		
			throw new RecordNotFoundException("Employee id '" + 1 + "' does no exist");
		}
		//return  
		
		
	
	@PostMapping(value="/add")

	public ResponseEntity<Farmer> createEmployee(@RequestBody Farmer framer)
	{
		Farmer addFarmer=null;
	
			addFarmer=farmerService.addNewEmployee(framer);
			//hrow new RecordNotFoundException("Employee id '" + 1 + "' does no exist");
		
		return ResponseEntity.of(Optional.of(addFarmer));
	
		
	}

	@GetMapping(value="/all")
	public List<?> createEmployee()
	{
		System.out.println("Adding Farmer details");
		return farmerService.getAllFarmer();
		
	}
}
