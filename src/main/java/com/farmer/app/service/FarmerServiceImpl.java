package com.farmer.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.farmer.app.Exception.RecordNotFoundException;
import com.farmer.app.dao.FarmerDaoRepository;
import com.farmer.app.model.Farmer;

@Service
@Transactional
public class FarmerServiceImpl implements FarmerService{

	@Autowired
	FarmerDaoRepository farmerDaoRepo;
	@Override
	@Transactional(rollbackFor=RecordNotFoundException.class)
	public Farmer addNewEmployee(Farmer farmer) {
		// TODO Auto-generated method stub
	return farmerDaoRepo.save(farmer);
	//throw new RecordNotFoundException("Employee id '" + 1 + "' does no exist");

	}
	@Override
	public List<?> getAllFarmer() {
		// TODO Auto-generated method stub
		return farmerDaoRepo.findAll();
	}

}
