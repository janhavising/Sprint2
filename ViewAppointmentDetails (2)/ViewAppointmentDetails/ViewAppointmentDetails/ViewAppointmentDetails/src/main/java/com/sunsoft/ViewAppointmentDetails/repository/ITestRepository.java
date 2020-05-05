package com.sunsoft.ViewAppointmentDetails.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sunsoft.ViewAppointmentDetails.entity.Test;

@Repository("testRepository")
public interface ITestRepository extends JpaRepository<Test,String>{

}
