package com.sunsoft.ViewAppointmentDetails.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sunsoft.ViewAppointmentDetails.entity.DiagnosticCenter;

@Repository("diagnosticCenter")
public interface IDiagnosticCenterRepository extends JpaRepository<DiagnosticCenter,String>{

}
