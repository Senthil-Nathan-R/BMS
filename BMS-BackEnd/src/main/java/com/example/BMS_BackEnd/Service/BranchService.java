package com.example.BMS_BackEnd.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.BMS_BackEnd.DAO.BankDAO;
import com.example.BMS_BackEnd.DAO.BranchDAO;
import com.example.BMS_BackEnd.DAO.VehicleDAO;
import com.example.BMS_BackEnd.Model.BankDetails;
import com.example.BMS_BackEnd.Model.BranchDetails;

@Service
public class BranchService {

	@Autowired
	private BranchDAO branch;

	@Autowired
	private BankDAO bank;
	
	@Autowired
	private VehicleDAO vehicle;

	// This method will save BranchDetails, BankDetails, and VehicleTypes at once
	public void addBranchDetails(BranchDetails branchDetails) {
		// Saving BranchDetails will also save associated BankDetails and VehicleTypes
		branch.save(branchDetails);
	}

	// Fetching all branch details
	public List<BranchDetails> getAllBranches() {
		return branch.findAll();
	}

	// Fetching branch details by branch code and including related bank details
	public BranchDetails getBranchByCode(String branchCode) {
		BranchDetails br = branch.findByBranchCode(branchCode);

		// Fetching and setting related bank details
		List<BankDetails> bankDetails = bank.findByBranchCode(branchCode);
		br.setBankDetails(bankDetails);

		return br;
	}

}