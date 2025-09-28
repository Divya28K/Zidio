package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.PaidSubscription;

public interface PaidSubscriptionRepository extends JpaRepository<PaidSubscription,Long> {

	List<PaidSubscription>findByRecruiterId(Long recruiterId);
	List<PaidSubscription>findByEmployeeId(Long employeeId);	
	List<PaidSubscription>findByUserEmail(String userEmail);
	
}
