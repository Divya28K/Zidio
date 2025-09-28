//package com.example.repository;
//
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;
//
//import com.example.Enum.Role;
//import com.example.entity.SystemUser;
//
//@Repository
//public interface SystemUserRepository extends JpaRepository <SystemUser, Long> {
//    SystemUser findByEmail(String email);
//    SystemUser findByRole(Role role);
//	public Long getId();
//	String getName();
//	String getEmail();
//	Role getRole();
//	boolean isActive();
//}
//
package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Enum.Role;
import com.example.entity.SystemUser;

@Repository
public interface SystemUserRepository extends JpaRepository<SystemUser, Long> {

    // Custom queries
    SystemUser findByEmail(String email);

    SystemUser findByRole(Role role);
}
