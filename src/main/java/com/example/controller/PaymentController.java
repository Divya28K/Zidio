package com.example.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.DTO.PaymentDTO;
import com.example.service.PaymentService;

@RestController
@RequestMapping("/api/payments")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    
    @PostMapping
    public ResponseEntity<PaymentDTO> pay(@RequestBody PaymentDTO dto) {
        PaymentDTO saved = paymentService.makePayment(dto);
        return ResponseEntity.ok(saved);
    }

    
    @GetMapping
    public ResponseEntity<List<PaymentDTO>> getAll() {
        List<PaymentDTO> payments = paymentService.getAllPayments();
        return ResponseEntity.ok(payments);
    }
}
