package com.kirti.portal.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.GenericGenerator;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class CustomerMasters {
	
	@Id
	private String Pk_Customer_Master;
	
	private String Cust_First_Name;
	private String Cust_Last_Name;
	private String Address;
	private String City;
	private String State;
	private String ContactNo;
	private String AdharCard;
	private String EmailId;
	private String BirthDate;
	private int MonthlySalary;
	
	@OneToMany(mappedBy="customerMasters",cascade=CascadeType.ALL)
	private List<LoanApplications> loanApplications=new ArrayList<>();

	public String getPk_Customer_Master() {
		return Pk_Customer_Master;
	}

	public void setPk_Customer_Master(String pk_Customer_Master) {
		Pk_Customer_Master = pk_Customer_Master;
	}

	public String getCust_First_Name() {
		return Cust_First_Name;
	}

	public void setCust_First_Name(String cust_First_Name) {
		Cust_First_Name = cust_First_Name;
	}

	public String getCust_Last_Name() {
		return Cust_Last_Name;
	}

	public void setCust_Last_Name(String cust_Last_Name) {
		Cust_Last_Name = cust_Last_Name;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public String getContactNo() {
		return ContactNo;
	}

	public void setContactNo(String contactNo) {
		ContactNo = contactNo;
	}

	public String getAdharCard() {
		return AdharCard;
	}

	public void setAdharCard(String adharCard) {
		AdharCard = adharCard;
	}

	public String getEmailId() {
		return EmailId;
	}

	public void setEmailId(String emailId) {
		EmailId = emailId;
	}

	public String getBirthDate() {
		return BirthDate;
	}

	public void setBirthDate(String birthDate) {
		BirthDate = birthDate;
	}

	public int getMonthlySalary() {
		return MonthlySalary;
	}

	public void setMonthlySalary(int monthlySalary) {
		MonthlySalary = monthlySalary;
	}

	public List<LoanApplications> getLoanApplications() {
		return loanApplications;
	}

	public void setLoanApplications(List<LoanApplications> loanApplications) {
		this.loanApplications = loanApplications;
	}

	public CustomerMasters(String pk_Customer_Master, String cust_First_Name, String cust_Last_Name, String address,
			String city, String state, String contactNo, String adharCard, String emailId, String birthDate,
			int monthlySalary, List<LoanApplications> loanApplications) {
		super();
		Pk_Customer_Master = pk_Customer_Master;
		Cust_First_Name = cust_First_Name;
		Cust_Last_Name = cust_Last_Name;
		Address = address;
		City = city;
		State = state;
		ContactNo = contactNo;
		AdharCard = adharCard;
		EmailId = emailId;
		BirthDate = birthDate;
		MonthlySalary = monthlySalary;
		this.loanApplications = loanApplications;
	}

	public CustomerMasters() {
		super();
		// TODO Auto-generated constructor stub
	} 
	
	
	
	
	
}
