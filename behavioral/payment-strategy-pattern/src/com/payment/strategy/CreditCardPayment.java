package com.payment.strategy;
public class CreditCardPayment implements PaymentStrategy {
    private String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(double amount) {
        // Simulate credit card payment processing
        System.out.printf("Processing credit card payment of $%.2f using card: %s%n",
                amount, maskCardNumber(cardNumber));
        System.out.println(" Credit card payment completed successfully!");
    }

    private String maskCardNumber(String cardNumber) {
        if (cardNumber == null || cardNumber.length() < 4) {
            return "****";
        }
        return "****-****-****-" + cardNumber.substring(cardNumber.length() - 4);
    }

    public String getCardNumber() {
        return cardNumber;
    }
}