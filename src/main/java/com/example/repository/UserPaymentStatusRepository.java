package com.example.repository;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.UserPaymentStatus;

@Repository
public interface UserPaymentStatusRepository extends JpaRepository<UserPaymentStatus, Long> {
    
    // Custom query method
    Optional<UserPaymentStatus> findByUserId(Long userId);
}

