package com.fiap.webhookfiaplanches.web;

import com.fiap.webhookfiaplanches.domain.dto.PaymentRecord;
import com.fiap.webhookfiaplanches.aplication.useCases.PaymentUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/pagamentos")
public class PaymentController {

    @Autowired
    PaymentUseCase paymentUseCase;

    @PostMapping
    public ResponseEntity<HttpStatus> receivePayment(@RequestBody PaymentRecord paymentRecord) {
        paymentUseCase.receivePayment(paymentRecord);

        return ResponseEntity.ok().build();
    }
}
