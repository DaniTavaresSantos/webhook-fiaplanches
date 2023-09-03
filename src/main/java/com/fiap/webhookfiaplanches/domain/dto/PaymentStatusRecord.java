package com.fiap.webhookfiaplanches.domain.dto;

import com.fiap.webhookfiaplanches.domain.enums.PaymentStatusEnum;

public record PaymentStatusRecord(PaymentStatusEnum status, String message, String orderId) {
}
