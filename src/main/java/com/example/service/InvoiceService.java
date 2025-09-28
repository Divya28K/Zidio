package com.example.service;

import java.io.ByteArrayOutputStream;
import java.time.LocalDate;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.SubscriptionPlan;
import com.example.repository.InvoiceRepository;
import com.example.repository.SubscriptionPlanRepository;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

@Service
public class InvoiceService {

    @SuppressWarnings("unused")
	@Autowired
    private InvoiceRepository invoiceRepository;

    @Autowired
    private SubscriptionPlanRepository subscriptionPlanRepository;

    public byte[] generateInvoice(Long subscriptionId) {
        SubscriptionPlan sub = subscriptionPlanRepository.findById(subscriptionId)
                .orElseThrow(() -> new RuntimeException("Subscription not found"));

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        Document document = new Document();

        try {
            PdfWriter.getInstance(document, baos);
            document.open();

            document.addTitle("Zidio_Connection_Invoice");

            document.add(new Paragraph("INVOICE", FontFactory.getFont(FontFactory.HELVETICA_BOLD, 20)));
            document.add(new Paragraph("Invoice number: ZIDIO-" + UUID.randomUUID()));
            document.add(new Paragraph("Issued Date: " + LocalDate.now()));

            // Assuming SubscriptionPlan has getUserEmail(), getPlanName(), getAmount()
            document.add(new Paragraph("Email: " + sub.getUserEmail()));
            document.add(new Paragraph("Subscription Plan: " + sub.getPlanName()));
            document.add(new Paragraph("Amount: ₹" + sub.getAmount()));

            document.close();
        } catch (DocumentException e) {
            e.printStackTrace();
        }

        return baos.toByteArray();
    }
}
