package com.fiap.webhookfiaplanches.domain.enums;

public enum PaymentMethodEnum {
    CREDIT_CARD("Cartão de Crédito"),
    DEBIT_CARD("Cartão de Débito"),
    PIX("PIX");

    private String paymentMethod;

    PaymentMethodEnum(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }
}
