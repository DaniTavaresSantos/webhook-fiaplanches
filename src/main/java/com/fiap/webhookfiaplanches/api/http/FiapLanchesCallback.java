package com.fiap.webhookfiaplanches.api.http;

import com.fiap.webhookfiaplanches.domain.dto.PaymentStatusRecord;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.service.annotation.HttpExchange;
import org.springframework.web.service.annotation.PostExchange;

@HttpExchange
public interface FiapLanchesCallback {

    @PostExchange("/pagamentos")
    void receivePayment(@RequestBody PaymentStatusRecord paymentStatusRecord);
}
