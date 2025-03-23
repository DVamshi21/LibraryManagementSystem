package services;



import java.util.Date;

import interfaces.Notifiable;
import models.books.BookItem;
import models.lending.BookReservation;
import models.people.Member;

public class BookReservationService {
    public void ReserveBook(Member member, BookItem bookItem,Notifiable notifiable) {
        BookReservation bookReservation = new BookReservation(member,bookItem,new Date(),notifiable);
        bookReservation.notifyReservation();
        
    }
    
}
