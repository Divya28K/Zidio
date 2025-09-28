package com.example.DTO;


import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.example.Enum.PaymentStatus;
import com.example.Enum.PaymentType;

public class PaymentDTO {

    public Long id;
    public Long userId;
    public Long planId;
    public String transactionId;
    public BigDecimal amount;
    public String currency;
    public PaymentStatus paymentStatus;
    public PaymentType paymentType;
    public LocalDateTime paymentDate;

    // Default constructor
    public PaymentDTO() {}

    // Optional: parameterized constructor
    public PaymentDTO(Long id, Long userId, Long planId, BigDecimal amount, String currency,
                      PaymentStatus paymentStatus, String transactionId, PaymentType paymentType,
                      LocalDateTime paymentDate) {
        this.id = id;
        this.userId = userId;
        this.planId = planId;
        this.amount = amount;
        this.currency = currency;
        this.paymentStatus = paymentStatus;
        this.transactionId = transactionId;
        this.paymentType = paymentType;
        this.paymentDate = paymentDate;
    }

    // Optional: Add getters and setters if needed
    // But if fields are public (like above), they are directly accessible
}
