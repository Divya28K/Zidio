package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.InvoiceService;

@RestController
@RequestMapping("api/invoice")
public class InvoiceController {

    @Autowired
    private InvoiceService invoiceService;

    @GetMapping("/download/{subscriptionPlan}")
    public ResponseEntity<byte[]> downloadInvoice(@PathVariable Long subscriptionPlan) throws Exception {
        byte[] pdfBytes = invoiceService.generateInvoice(subscriptionPlan);

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_PDF); // Correct content type for PDF
        headers.setContentDispositionFormData("attachment", "Invoice.pdf"); // Corrected spelling and method

        return new ResponseEntity<>(pdfBytes, headers, HttpStatus.OK); // Corrected variable and status
    }
}
