package com.fiap.webhookfiaplanches.infrastructure;

import com.fiap.webhookfiaplanches.domain.dto.PaymentRecord;
import com.fiap.webhookfiaplanches.domain.dto.PaymentStatusRecord;
import com.fiap.webhookfiaplanches.domain.enums.PaymentStatusEnum;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class PaymentGatewayImpl implements PaymentGateway {

    Random random = new Random();

    @Override
    public PaymentStatusRecord receivePayment(PaymentRecord paymentRecord) {
        int chance = random.nextInt(100) + 1;

        String orderId = paymentRecord.orderId();

        if (chance <= 5) {
            return new PaymentStatusRecord(PaymentStatusEnum.REJECTED, "Insufficient funds.", orderId);
        } else if (chance <= 10) {
            return new PaymentStatusRecord(PaymentStatusEnum.REJECTED, "Network error.", orderId);
        } else {
            return new PaymentStatusRecord(PaymentStatusEnum.APPROVED, "Payment successful.", orderId);
        }
    }
}
