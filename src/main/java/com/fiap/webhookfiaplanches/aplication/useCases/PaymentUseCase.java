package com.fiap.webhookfiaplanches.aplication.useCases;

import com.fiap.webhookfiaplanches.web.http.FiapLanchesCallback;
import com.fiap.webhookfiaplanches.domain.dto.PaymentRecord;
import com.fiap.webhookfiaplanches.domain.dto.PaymentStatusRecord;
import com.fiap.webhookfiaplanches.infrastructure.abstractions.PaymentGateway;
import org.springframework.stereotype.Service;

@Service
public class PaymentUseCase {

    private final PaymentGateway paymentGateway;

    private final FiapLanchesCallback fiapLanchesCallback;

    public PaymentUseCase(PaymentGateway paymentGateway, FiapLanchesCallback fiapLanchesCallback) {
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
