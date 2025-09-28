package com.example.DTO;


import java.time.LocalDate;

import com.example.Enum.PaymentStatus;

public class PaidSubscriptionDTO {

    private Long id;
    private Long recruiterId;
    private Long employeeId;
    private Long planId;
    
    private String userEmail;
    private LocalDate startDate;
    private LocalDate endDate;
    public Double amount;
	public String currency;
    private PaymentStatus paymentStatus;
    private String invoiceURL;

    public PaidSubscriptionDTO() {}

    public PaidSubscriptionDTO(Long id, Long recruiterId, Long employeeId, Long planId, String userEmail,
                               LocalDate startDate, LocalDate endDate,Double amount,String currency, PaymentStatus paymentStatus, String invoiceURL) {
        this.id = id;
        this.recruiterId = recruiterId;
        this.employeeId = employeeId;
        this.planId = planId;
        this.userEmail = userEmail;
        this.startDate = startDate;
        this.endDate = endDate;
        this.amount = amount;
        this.currency = currency;
        this.paymentStatus = paymentStatus;
        this.invoiceURL = invoiceURL;
    }

    public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
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

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
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
