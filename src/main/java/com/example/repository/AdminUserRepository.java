package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cloudinary.provisioning.Account.Role;
import com.example.entity.AdminUser;


@SuppressWarnings("unused")
@Repository
public interface AdminUserRepository extends JpaRepository<AdminUser,Long>{
	AdminUser findByEmail(String email);
	List<AdminUser> findByRole(com.example.Enum.Role role);

}

