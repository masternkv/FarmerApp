package com.farmer.app.service;

import java.util.List;

import com.farmer.app.model.Farmer;

public interface FarmerService {
	public Farmer addNewEmployee(Farmer farmer);
	public List<?> getAllFarmer();

}
