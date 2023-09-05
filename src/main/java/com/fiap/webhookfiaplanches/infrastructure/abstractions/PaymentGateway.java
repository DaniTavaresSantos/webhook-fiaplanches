package com.fiap.webhookfiaplanches.infrastructure.abstractions;

import com.fiap.webhookfiaplanches.domain.dto.PaymentRecord;
import com.fiap.webhookfiaplanches.domain.dto.PaymentStatusRecord;

public interface PaymentGateway {

    PaymentStatusRecord receivePayment(PaymentRecord paymentRecord);
}
