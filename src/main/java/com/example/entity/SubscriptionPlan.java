package com.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="sucription_plans")
public class SubscriptionPlan {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String name;
	private Double price;
	private String description;
	private Integer durationInDays;
	
	private String userEmail;
	private String planName;
	private String amount;
	
	
	private String razorpayorderId;
	private String razorpayPaymentId;
	
	public SubscriptionPlan() {}
	
	public SubscriptionPlan(Long id,String name,String description,Double price,Integer durationInDays,String userEmail,String planName,String amount,String razorpayorderId,String razorpayPaymentId) {
		this.id=id;
		this.name=name;
		this.description=description;
		this.price=price;
		this.durationInDays=durationInDays;
		this.razorpayorderId=razorpayorderId;
		this.razorpayPaymentId=razorpayPaymentId;
		
	}
	public String getRazorpayorderId() {
		return razorpayorderId;
	}

	public void setRazorpayorderId(String razorpayorderId) {
		this.razorpayorderId = razorpayorderId;
	}

	public String getRazorpayPaymentId() {
		return razorpayPaymentId;
	}

	public void setRazorpayPaymentId(String razorpayPaymentId) {
		this.razorpayPaymentId = razorpayPaymentId;
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
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getDurationInDays() {
		return durationInDays;
	}

	public void setDurationInDays(Integer durationInDays) {
		this.durationInDays = durationInDays;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getPlanName() {
		return planName;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	
	
	
	
	

}

