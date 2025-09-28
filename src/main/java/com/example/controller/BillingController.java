package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.DTO.InvoiceDTO;
import com.example.entity.Invoice;

import com.example.service.BillingService;
import com.example.service.RazorPayService;

@RestController
@RequestMapping("/api/invoice")
public class BillingController {
	
	@Autowired
	private BillingService billingService;
	@Autowired
	public RazorPayService rozorpayService;
	
	
	@PostMapping("/pay")
	public ResponseEntity<Invoice>payforService(@RequestBody InvoiceDTO dto){
		return ResponseEntity.ok(billingService.createInvoice(dto));	
	}
	
	@PostMapping("/history/{email}")
	public ResponseEntity<List<Invoice>> getHistory(@PathVariable String email){
		return ResponseEntity.ok(billingService.getInvoice(email));
	}
	
	@PostMapping("create-order")
	public ResponseEntity<String>createOrder(@RequestBody Double amount){
		String order=rozorpayService.createOrder(amount, "INR", "rcpt-"+System.currentTimeMillis());
		return ResponseEntity.ok(order);
	}

}
