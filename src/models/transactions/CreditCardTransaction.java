package models.transactions;

import interfaces.PaymentMethod;

public class CreditCardTransaction implements PaymentMethod {
    private String cardNumber;
    public CreditCardTransaction(String cardNumber, String cardHolder, String expirationDate, String cvv) {
        this.cardNumber = cardNumber;
    }

    

    @Override
    public void processPayment(double amount) {

        System.out.println("Processing payment of " + amount + " using credit card " + cardNumber);
     
     }
    
}
