package com.sunsoft.ViewAppointmentDetails.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sunsoft.ViewAppointmentDetails.entity.Appointment;
import com.sunsoft.ViewAppointmentDetails.entity.DiagnosticCenter;
import com.sunsoft.ViewAppointmentDetails.entity.Test;
import com.sunsoft.ViewAppointmentDetails.entity.User;
import com.sunsoft.ViewAppointmentDetails.exception.ResourceNotFoundException;
import com.sunsoft.ViewAppointmentDetails.service.IViewAppointmentDetails;

@RestController
 
public class ViewAppointmentController {

	@Autowired
	IViewAppointmentDetails app_details;
	
	
	@RequestMapping("/getAppointment/{userID}")
	public Appointment getAppointment (@PathVariable String userID)
	{
		return app_details.getAppointments(userID);
	}
 
    @RequestMapping("/getDiagnosticCenter/{centerId}")
    public String getCenter(@PathVariable String centerId)
    {
    	DiagnosticCenter dc=app_details.getCenterNames(centerId);
    	return "center Name:  "+dc.getCenterName()+"  "+"Center Address: "+dc.getAddress()+" "+"Contact No: "+dc.getContactNo();
    }
    
    @RequestMapping("/getTestName/{testId}")
    public String getTest(@PathVariable String testId)
    {
    	Test test=app_details.getTestNames(testId);
    	return test.getTestName();
    }
    @RequestMapping("/getUser/{userId}")
    public String getUserDetails(@PathVariable String userId)
    {
    	User user=app_details.getUsers(userId);
    	return "User Name is: "+user.getUserName()+" "+"Email Id: "+user.getEmailId()+" "+"Contact No.: "+user.getContactNo();
    }

	@SuppressWarnings("rawtypes")
	@RequestMapping("/getAppointmentDetails/{userID}") 
    public List getAppointmentDetails (@PathVariable String userID)throws ResourceNotFoundException
	{
		List list=app_details.viewAppointmentDetail(userID);
		if (list == null)
		{
		    		throw new ResourceNotFoundException("No user records are available for you "+userID);

		}
		return list;
		
	}
    
} 
    
