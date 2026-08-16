package com.payment;

import com.payment.context.PaymentContext;
import com.payment.strategy.BankTransferPayment;
import com.payment.strategy.CreditCardPayment;
import com.payment.strategy.PayPalPayment;

import com.payment.strategy.*;
public class Main {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        context.setPaymentStrategy(new CreditCardPayment("1234567812345678"));
        context.executePayment(250.00);

        context.setPaymentStrategy(new PayPalPayment("user@example.com"));
        context.executePayment(75.50);

        context.setPaymentStrategy(new BankTransferPayment("TN59004012345678901234"));
        context.executePayment(500.00);
    }
}