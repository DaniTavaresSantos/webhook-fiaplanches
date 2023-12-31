package com.fiap.webhookfiaplanches.web.http;

import com.fiap.webhookfiaplanches.domain.dto.PaymentStatusRecord;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.service.annotation.HttpExchange;
import org.springframework.web.service.annotation.PostExchange;

@HttpExchange
public interface FiapLanchesCallback {

    @PostExchange("/pedidos/atualiza-status-pagamento")
    void receivePayment(@RequestBody PaymentStatusRecord paymentStatusRecord);
}
