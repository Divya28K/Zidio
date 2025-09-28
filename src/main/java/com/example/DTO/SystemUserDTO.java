//package com.example.DTO;
//
//import com.example.Enum.Role;
//
//public class SystemUserDTO {
//	
//	private Long id;
//	private String name;
//	p String email;
//	public Role role;
//	public boolean isActive;
//	
//    public SystemUserDTO() {}
//    public SystemUserDTO(Long id,String name,String email,Role role,boolean isActive) {
//    	
//    	this.id=id;
//    	this.name=name;
//    	this.email=email;
//    	this.role=role;
//    	this.isActive=isActive;
//    	
//    }
//}

package com.example.DTO;

import com.example.Enum.Role;

public class SystemUserDTO {

    private Long id;
    private String name;
    private String email;
    private Role role;
    private boolean active;

    
    public SystemUserDTO() {}

    
    public SystemUserDTO(Long id, String name, String email, Role role, boolean active) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.role = role;
        this.active = active;
    }

   
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
