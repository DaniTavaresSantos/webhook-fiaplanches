package com.fiap.webhookfiaplanches.api;

import com.fiap.webhookfiaplanches.domain.dto.PaymentRecord;
import com.fiap.webhookfiaplanches.domain.service.PaymentService;
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
    PaymentService paymentService;

    @PostMapping
    public ResponseEntity<HttpStatus> receivePayment(@RequestBody PaymentRecord paymentRecord) {
        paymentService.receivePayment(paymentRecord);

        return ResponseEntity.ok().build();
    }
}
