package com.farmer.app.dao;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.farmer.app.model.Farmer;

@Repository
//@Transactional
public interface FarmerDaoRepository extends JpaRepository<Farmer, Integer>{

}
