package models.transactions;

import interfaces.Notifiable;
import interfaces.PaymentMethod;


public class Fine {
    private double amount;
    private PaymentMethod paymentMethod;
    private Notifiable notifiable;

    public Fine(double amount, PaymentMethod paymentMethod, Notifiable notifiable) {
        this.amount = amount;
        this.notifiable = notifiable;   
        this.paymentMethod = paymentMethod;
    }
    public double getAmount() {
        return amount;
    }
    public void payFine() {
        paymentMethod.processPayment(amount);
        notifiable.sendNotification("Fine paid successfully");
    }
    
}
