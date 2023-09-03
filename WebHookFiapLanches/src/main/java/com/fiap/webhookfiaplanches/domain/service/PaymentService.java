package com.fiap.webhookfiaplanches.domain.service;

import com.fiap.webhookfiaplanches.api.http.FiapLanchesCallback;
import com.fiap.webhookfiaplanches.domain.dto.PaymentRecord;
import com.fiap.webhookfiaplanches.domain.dto.PaymentStatusRecord;
import com.fiap.webhookfiaplanches.infrastructure.PaymentGateway;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    private final PaymentGateway paymentGateway;

    private final FiapLanchesCallback fiapLanchesCallback;

    public PaymentService(PaymentGateway paymentGateway, FiapLanchesCallback fiapLanchesCallback) {
        this.paymentGateway = paymentGateway;
        this.fiapLanchesCallback = fiapLanchesCallback;
    }

    public void receivePayment(PaymentRecord paymentRecord) {

        PaymentStatusRecord paymentStatusRecord = paymentGateway.receivePayment(paymentRecord);

        fiapLanchesCallback.receivePayment(paymentStatusRecord);
    }

    public void receivePaymentCallback(PaymentStatusRecord paymentRecord) {

        fiapLanchesCallback.receivePayment(paymentRecord);
    }

}
