package com.sunsoft.ViewAppointmentDetails.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sunsoft.ViewAppointmentDetails.entity.Appointment;
import com.sunsoft.ViewAppointmentDetails.entity.DiagnosticCenter;
import com.sunsoft.ViewAppointmentDetails.entity.Test;
import com.sunsoft.ViewAppointmentDetails.entity.User;
import com.sunsoft.ViewAppointmentDetails.repository.IAppointmentRepository;
import com.sunsoft.ViewAppointmentDetails.repository.IDiagnosticCenterRepository;
import com.sunsoft.ViewAppointmentDetails.repository.ITestRepository;
import com.sunsoft.ViewAppointmentDetails.repository.IUserRepository;




@Component
public class ViewAppointmentDetailsDAO implements IViewAppointmentDetailsDAO{

	@Autowired 
	IAppointmentRepository  appointmentRepository;
	@Autowired 
	IDiagnosticCenterRepository diagnosticCenter;
	@Autowired
	ITestRepository testRepository;
	
	@Autowired
	IUserRepository userRepository;
	@Override
	public Appointment getAppointment (String UserID)
	{
		return appointmentRepository.findAppointmentByUserID(UserID);
	}
	
	
	@Override
	public DiagnosticCenter getCenterName(String centerId) {
		
		return diagnosticCenter.findById(centerId).get();
	}


	@Override
	public Test getTestName(String testId) {
		// TODO Auto-generated method stub
		return testRepository.findById(testId).get();
	}


	@SuppressWarnings("rawtypes")
	@Override
	public List viewAppointmentDetails(String UserId) {
		// TODO Auto-generated method stub
		return appointmentRepository.findAppointmentDetailsByUserID (UserId);
	}


	@Override
	public User getUser(String userId) {
		// TODO Auto-generated method stub
		return userRepository.findById(userId).get();
	}
	
}
