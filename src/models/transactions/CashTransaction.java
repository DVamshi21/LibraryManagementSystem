package models.transactions;

import interfaces.PaymentMethod;

public class CashTransaction implements PaymentMethod {
    private double cashtendered;

    public CashTransaction(double cashtendered) {
        this.cashtendered = cashtendered;
    }

    public void processPayment(double amount) {
        if(cashtendered >= amount){
            System.out.println("Processing cash payment of $" + amount);
        } else {
            System.out.println("Insufficient funds. Please provide more cash.");
        }
        
    }
    
}
