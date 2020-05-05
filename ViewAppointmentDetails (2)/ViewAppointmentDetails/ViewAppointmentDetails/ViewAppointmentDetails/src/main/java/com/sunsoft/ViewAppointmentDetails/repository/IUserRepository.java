package com.sunsoft.ViewAppointmentDetails.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sunsoft.ViewAppointmentDetails.entity.User;
@Repository("UserRepository")
public interface IUserRepository extends JpaRepository<User,String>{

}
