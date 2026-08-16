package com.payment.context;

import com.payment.strategy.PaymentStrategy;

public class PaymentContext {
    private PaymentStrategy strategy;

    public PaymentContext(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public PaymentContext() {
    }

    public void setPaymentStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
        System.out.println("Payment strategy changed to: " + strategy.getClass().getSimpleName());
    }

    public void executePayment(double amount) {
        if (strategy == null) {
            throw new IllegalStateException("No payment strategy set!");
        }

        System.out.println("\n--- Processing Payment ---");
        System.out.printf("Amount: $%.2f%n", amount);
        System.out.println("Method: " + strategy.getClass().getSimpleName());
        strategy.pay(amount);
        System.out.println("--- Payment Complete ---\n");
    }

    public PaymentStrategy getPaymentStrategy() {
        return strategy;
    }
}