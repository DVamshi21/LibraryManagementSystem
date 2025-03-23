package services;

import interfaces.Notifiable;
import interfaces.PaymentMethod;
import models.people.Member;
import models.transactions.Fine;

public class FineService {

    public void ProcessFine(double amount, PaymentMethod paymentMethod,Notifiable notifiable) {
        Fine fine = new Fine(amount, paymentMethod,notifiable);
        fine.payFine();
        
    }

    
}
