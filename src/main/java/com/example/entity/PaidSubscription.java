package com.example.entity;

import java.time.LocalDate;



import com.example.Enum.PaymentStatus;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="paidSubscriptions")
public class PaidSubscription {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private Long id;
	
	private Long recruiterId;
	private Long employeeId;
	
	private Long planId;
	private Double amount;
	private String userEmail;
	private LocalDate startDate;
	private LocalDate endDate;
	private String currency;
	
	private PaymentStatus paymentStatus;
	
	private String invoiceURL;
	
	public PaidSubscription() {}
	public PaidSubscription(Long id,Long recruiterId,Long employeeId,Long planId,Double amount,String userEmail,LocalDate startDate,LocalDate endDate,String currency,PaymentStatus paymentStatus,String invoiceURL) {
		this.id=id;
		this.recruiterId=recruiterId;
		this.employeeId=employeeId;
		this.planId=planId;
		this.amount=amount;
		this.userEmail=userEmail;
		this.startDate=startDate;
		this.endDate=endDate;
		this.currency=currency;
		this.paymentStatus=paymentStatus;
		this.invoiceURL=invoiceURL;
		
		
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getRecruiterId() {
		return recruiterId;
	}
	public void setRecruiterId(Long recruiterId) {
		this.recruiterId = recruiterId;
	}
	public Long getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}
	public Long getPlanId() {
		return planId;
	}
	public void setPlanId(Long planId) {
		this.planId = planId;
	}
	public LocalDate getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	public LocalDate getEndDate() {
		return endDate;
	}
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
	public PaymentStatus getPaymentStatus() {
		return paymentStatus;
	}
	public void setPaymentStatus(PaymentStatus paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
	public String getInvoiceURL() {
		return invoiceURL;
	}
	public void setInvoiceURL(String invoiceURL) {
		this.invoiceURL = invoiceURL;
	}

}
