package com.sunsoft.ViewAppointmentDetails.entity;



import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="appointment")
public class Appointment {

	@Id	
	@Column(name="APPOINTMENT_ID")
	private int appointmentId;
	
	@Column(name="USER_ID")
	private String userId;
	
	@Column(name="DATE_TIME")
	private Timestamp DateTime;	
	
	@Column(name="STATUS",columnDefinition = "varchar(255) default 'pending'")
	private String status;
	@Column(name="CENTER_ID")
	private String centerId;

	@Column(name="TEST_ID")
	private String testId;


	public int getAppointmentId() {
		return appointmentId;
	}


	public void setAppointmentId(int appointmentId) {
		this.appointmentId = appointmentId;
	}


	public String getUserId() {
		return userId;
	}


	public void setUserId(String userId) {
		this.userId = userId;
	}


	public Timestamp getDateTime() {
		return DateTime;
	}


	public void setDateTime(Timestamp dateTime) {
		DateTime = dateTime;
	}


	public String isStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public String getCenterId() {
		return centerId;
	}


	public void setCenterId(String center_id) {
		this.centerId = center_id;
	}


	public String getTestId() {
		return testId;
	}


	public void setTestId(String test_id) {
		this.testId = test_id;
	}
	
	
}



