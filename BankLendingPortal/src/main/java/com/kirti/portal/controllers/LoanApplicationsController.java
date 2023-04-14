package com.kirti.portal.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kirti.portal.entities.LoanApplications;
import com.kirti.portal.payloads.LoanApplicationsDto;
import com.kirti.portal.services.LoanApplicationsService;

@RestController
@RequestMapping("/api")
public class LoanApplicationsController {
	
	@Autowired
	private LoanApplicationsService loanAppService;
	
	//create loan Application
	@PostMapping("customer/{userId}/loanApp")
	public ResponseEntity<LoanApplicationsDto> createLoanApp(
			@RequestBody LoanApplicationsDto loanAppDto,
			@PathVariable String userId){
		
		LoanApplicationsDto createLoanApp=this.loanAppService.createLoanApplication(loanAppDto,userId);
		
		return new ResponseEntity<LoanApplicationsDto>(createLoanApp,HttpStatus.CREATED);
		
	}
	
	//get by customer
	@GetMapping("customers/{userId}/loans/")
	public List<LoanApplicationsDto> getLoanApplicationsByCustomerMasters(
			@PathVariable String userId){
		
		List<LoanApplicationsDto> loanApps= this.loanAppService.getLoanApplicationsByCustomerMaster(userId);
		return loanApps;
		//return new ResponseEntity< List<LoanApplicationsDto>>(loanApps,HttpStatus.CREATED);
	}
	
	//loan records based on the status like  NewLoan/Pending/approved/
	@GetMapping("customers/loan/{status}")
	public List<LoanApplicationsDto> getLoanApplicationsByStatus(@PathVariable String status){
		 List<LoanApplicationsDto> loanApps=this.loanAppService.searchLoanApplicationsByStatus(status);
		 return loanApps;
	}
	
	//delete loan app
	@DeleteMapping("customers/loan/delete/{loanAppId}")
	public String deleteLoanApp(@PathVariable String loanAppId) {
		
		this.loanAppService.deleteLoanApplications(loanAppId);
		
		return "Succefully Delete";
	}
	
}
