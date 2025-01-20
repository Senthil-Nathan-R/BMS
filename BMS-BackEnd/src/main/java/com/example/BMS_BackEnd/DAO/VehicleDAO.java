package com.example.BMS_BackEnd.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.BMS_BackEnd.Model.BranchDetailsVehicleType;

public interface VehicleDAO extends JpaRepository<BranchDetailsVehicleType, Long>  {

}
