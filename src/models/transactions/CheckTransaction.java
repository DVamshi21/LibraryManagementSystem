package models.transactions;

import interfaces.PaymentMethod;

public class CheckTransaction implements PaymentMethod {
    private String checkNumber;
    

    public CheckTransaction(String checkNumber) {
        this.checkNumber = checkNumber;
        
    }

    public void processPayment(double amount) {
        System.out.println("Processing payment of " + amount + " using check number " + checkNumber);
    }
    
}
