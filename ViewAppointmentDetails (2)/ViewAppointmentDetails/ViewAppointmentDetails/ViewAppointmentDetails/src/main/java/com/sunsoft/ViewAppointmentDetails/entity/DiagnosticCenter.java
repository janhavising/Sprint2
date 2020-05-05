package com.sunsoft.ViewAppointmentDetails.entity;

import java.math.BigInteger;



import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="center")
public class DiagnosticCenter {

	@Id
	private String centerId;
	

	private String centerName;
	

	private BigInteger contactNo;
	

	private String address;
	
	
	public String getCenterId() {
		return centerId;
	}
	public void setCenterId(String centerId) {
		this.centerId = centerId;
	}
	public String getCenterName() {
		return centerName;
	}
	public void setCenterName(String centerName) {
		this.centerName = centerName;
	}
	public BigInteger getContactNo() {
		return contactNo;
	}
	public void setContactNo(BigInteger contactNo) {
		this.contactNo = contactNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}





