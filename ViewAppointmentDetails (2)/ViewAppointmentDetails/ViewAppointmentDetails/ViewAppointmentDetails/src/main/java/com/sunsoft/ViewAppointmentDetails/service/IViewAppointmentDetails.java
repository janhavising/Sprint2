 package com.sunsoft.ViewAppointmentDetails.service;



import java.util.List;

import com.sunsoft.ViewAppointmentDetails.entity.Appointment;
import com.sunsoft.ViewAppointmentDetails.entity.DiagnosticCenter;
import com.sunsoft.ViewAppointmentDetails.entity.Test;
import com.sunsoft.ViewAppointmentDetails.entity.User;

public interface IViewAppointmentDetails {
	
	public Appointment getAppointments (String UserID);

	public DiagnosticCenter getCenterNames(String centerId);

	public Test getTestNames(String testId);
	@SuppressWarnings("rawtypes")
	public List viewAppointmentDetail(String UserId);

	public User getUsers(String userId);
} 
