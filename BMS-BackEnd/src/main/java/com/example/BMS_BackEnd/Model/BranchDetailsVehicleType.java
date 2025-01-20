package com.example.BMS_BackEnd.Model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Entity;

@Entity
public class BranchDetailsVehicleType {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String vehicleType;

    @ManyToOne
    private BranchDetails branchDetails;  

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public BranchDetails getBranchDetails() {
        return branchDetails;
    }

    public void setBranchDetails(BranchDetails branchDetails) {
        this.branchDetails = branchDetails;
    }
}