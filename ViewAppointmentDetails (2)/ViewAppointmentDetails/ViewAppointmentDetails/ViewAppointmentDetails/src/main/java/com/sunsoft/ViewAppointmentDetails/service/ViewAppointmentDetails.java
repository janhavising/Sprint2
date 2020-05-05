 package com.sunsoft.ViewAppointmentDetails.service;






import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunsoft.ViewAppointmentDetails.dao.IViewAppointmentDetailsDAO;
import com.sunsoft.ViewAppointmentDetails.entity.Appointment;
import com.sunsoft.ViewAppointmentDetails.entity.DiagnosticCenter;
import com.sunsoft.ViewAppointmentDetails.entity.Test;
import com.sunsoft.ViewAppointmentDetails.entity.User;
import com.sunsoft.ViewAppointmentDetails.repository.IAppointmentRepository;
import com.sunsoft.ViewAppointmentDetails.repository.IDiagnosticCenterRepository;
import com.sunsoft.ViewAppointmentDetails.repository.ITestRepository;
import com.sunsoft.ViewAppointmentDetails.repository.IUserRepository;
 
@Service
public class ViewAppointmentDetails implements IViewAppointmentDetails{
 
	@Autowired
	IViewAppointmentDetailsDAO dao;

	@Override
	public Appointment getAppointments(String UserID) {
		// TODO Auto-generated method stub
		return dao.getAppointment(UserID);
	}

	@Override
	public DiagnosticCenter getCenterNames(String centerId) {
		// TODO Auto-generated method stub
		return dao.getCenterName(centerId);
	}

	@Override
	public Test getTestNames(String testId) {
		// TODO Auto-generated method stub
		return dao.getTestName(testId);
	}

	@SuppressWarnings("rawtypes")
	@Override
	public List viewAppointmentDetail(String UserId) {
		// TODO Auto-generated method stub
		return dao.viewAppointmentDetails(UserId);
	}

	@Override
	public User getUsers(String userId) {
		// TODO Auto-generated method stub
		return dao.getUser(userId);
	}
	
	
}