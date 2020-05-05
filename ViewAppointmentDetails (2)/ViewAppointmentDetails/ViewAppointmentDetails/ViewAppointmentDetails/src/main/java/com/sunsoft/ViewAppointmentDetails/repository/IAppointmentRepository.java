package com.sunsoft.ViewAppointmentDetails.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sunsoft.ViewAppointmentDetails.entity.Appointment;

@Repository("appointmentRepository")
public interface IAppointmentRepository extends JpaRepository<Appointment, Integer>{
	
	
	@Query ("select a from Appointment a where a.userId =?1")
	Appointment findAppointmentByUserID (String UserID);
	
	/*@Query("select a.appointmentId,a.status, t.testId,t.testName,"
			+ "u.userName,u.userId,u.emailId,u.contactNo,u.userRole,c.centerId,"
			+ "c.centerName,c.address,c.contactNo FROM Appointment a, Test t,User u "
			+ ",DiagnosticCenter c WHERE a.testId = t.testId and a.userId=u.userId"
			+ " and a.centerId=c.centerId")
	public List joinTable();*/
	
	@SuppressWarnings("rawtypes")
	@Query("select a.appointmentId,a.status, t.testId,t.testName,"
			+ "u.userName,u.userId,u.emailId,u.contactNo,u.userRole,c.centerId,"
			+ "c.centerName,c.address,c.contactNo FROM Appointment a, Test t,User u "
			+ ",DiagnosticCenter c WHERE a.testId = t.testId and a.userId=u.userId"
			+ " and a.centerId=c.centerId and u.userId=:userId")
	public List findAppointmentDetailsByUserID (@Param("userId") String userId);
}
