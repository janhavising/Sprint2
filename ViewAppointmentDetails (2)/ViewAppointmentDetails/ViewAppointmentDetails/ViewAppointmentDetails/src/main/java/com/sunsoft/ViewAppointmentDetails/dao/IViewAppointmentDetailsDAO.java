package com.sunsoft.ViewAppointmentDetails.dao;

import java.util.List;

import com.sunsoft.ViewAppointmentDetails.entity.Appointment;
import com.sunsoft.ViewAppointmentDetails.entity.DiagnosticCenter;
import com.sunsoft.ViewAppointmentDetails.entity.Test;
import com.sunsoft.ViewAppointmentDetails.entity.User;

public interface IViewAppointmentDetailsDAO {

	@SuppressWarnings("rawtypes")
	public List viewAppointmentDetails(String UserId);

	public Test getTestName(String testId);

	public DiagnosticCenter getCenterName(String centerId);

	public Appointment getAppointment(String UserID);

	public User getUser(String userId);

	
}
