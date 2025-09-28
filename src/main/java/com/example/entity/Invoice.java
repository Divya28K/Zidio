package com.example.entity;

import java.time.LocalDateTime;


//import org.bouncycastle.asn1.dvcs.ServiceType;

import com.example.Enum.PaymentStatus;
import com.example.Enum.PaymentType;
import com.example.Enum.ServiceType;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="invoice")
public class Invoice {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String userEmail;
	private ServiceType serviceType;
	private Double amount;
	private LocalDateTime purchaseDate=LocalDateTime.now();
	private PaymentType paymentMethod;
	private PaymentStatus status;
	private String invoiceNumber;
	private String invoiceDownloadURL;
	private String subscriptionPlan;
	
	
	public Invoice() {}
	public Invoice(Long id, String userEmail, ServiceType serviceType, Double amount, LocalDateTime purchaseDate,PaymentType paymentMethod, PaymentStatus status,String invoiceNumber,String invoiceDownloadURL,String subscriptionPlan) {
		this.id=id;
		this.userEmail=userEmail;
		this.serviceType=serviceType;
		this.amount=amount;
		this.purchaseDate=purchaseDate;
		this.paymentMethod=paymentMethod;
		this.status=status;
		this.subscriptionPlan=subscriptionPlan;
	}
	public String getSubscriptionPlan() {
		return subscriptionPlan;
	}
	public void setSubscriptionPlan(String subscriptionPlan) {
		this.subscriptionPlan = subscriptionPlan;
	}
	public String getInvoiceNumber() {
		return invoiceNumber;
	}
	public void setInvoiceNumber(String invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}
	public String getInvoiceDownloadURL() {
		return invoiceDownloadURL;
	}
	public void setInvoiceDownloadURL(String invoiceDownloadURL) {
		this.invoiceDownloadURL = invoiceDownloadURL;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public ServiceType getServiceType() {
		return serviceType;
	}
	public void setServiceType(ServiceType serviceType) {
		this.serviceType = serviceType;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public LocalDateTime getPurchaseDate() {
		return purchaseDate;
	}
	public void setPurchaseDate(LocalDateTime purchaseDate) {
		this.purchaseDate = purchaseDate;
	}
	public PaymentType getPaymentMethod() {
		return paymentMethod;
	}
	public void setPaymentMethod(PaymentType paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	public PaymentStatus getStatus() {
		return status;
	}
	public void setStatus(PaymentStatus status) {
		this.status = status;
	}
	
	

}




