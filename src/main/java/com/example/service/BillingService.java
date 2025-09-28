package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.DTO.InvoiceDTO;
import com.example.entity.Invoice;
import com.example.repository.InvoiceRepository;



@Service
public class BillingService {

	@Autowired
	private InvoiceRepository invoiceRepository;
	
	public Invoice createInvoice(InvoiceDTO dto) {
		Invoice invoice= new Invoice();
		invoice.setId(dto.id);
		invoice.setUserEmail(dto.userEmail);
		invoice.setServiceType(dto.serviceType);
	invoice.setAmount(dto.amount);
	invoice.setPurchaseDate(dto.purchaseDate);
		invoice.setPaymentMethod(dto.paymentMethod);
		invoice.setStatus(dto.status);
		
		return invoiceRepository.save(invoice);
		
	}
	public List<Invoice>getInvoice(String userEmail){
		return invoiceRepository.findByUserEmail(userEmail);
	}
}



