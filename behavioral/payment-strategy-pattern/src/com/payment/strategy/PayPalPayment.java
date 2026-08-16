package com.payment.strategy;

public class PayPalPayment implements PaymentStrategy {
    private String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public void pay(double amount) {
        // Simulate PayPal payment processing
        System.out.printf("Processing PayPal payment of $%.2f using email: %s%n", amount, email);
        System.out.println("Redirecting to PayPal...");
        System.out.println("PayPal payment completed successfully!");
    }

    public String getEmail() {
        return email;
    }
}