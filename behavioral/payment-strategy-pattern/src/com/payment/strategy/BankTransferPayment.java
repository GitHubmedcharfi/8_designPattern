package com.payment.strategy;

public class BankTransferPayment implements PaymentStrategy {
    private String bankAccount;

    public BankTransferPayment(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public void pay(double amount) {
        // Simulate bank transfer processing
        System.out.printf("Processing bank transfer of $%.2f to account: %s%n",
                amount, maskAccountNumber(bankAccount));
        System.out.println(" Initiating bank transfer...");
        System.out.println(" Bank transfer initiated successfully!");
    }

    private String maskAccountNumber(String accountNumber) {
        if (accountNumber == null || accountNumber.length() < 4) {
            return "****";
        }
        return "***" + accountNumber.substring(accountNumber.length() - 4);
    }

    public String getBankAccount() {
        return bankAccount;
    }
}