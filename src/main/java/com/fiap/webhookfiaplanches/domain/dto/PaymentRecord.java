package com.fiap.webhookfiaplanches.domain.dto;

import com.fiap.webhookfiaplanches.domain.enums.PaymentMethodEnum;

import java.math.BigDecimal;

public record PaymentRecord(String userId,
                            PaymentMethodEnum paymentMethod,
                            String orderId,
                            BigDecimal totalAmount,
                            PaymentStatusRecord paymentStatus) {
}
