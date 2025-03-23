package models.lending;


import java.util.Date;

import models.books.BookItem;
import models.people.Member;
import interfaces.Notifiable;


public class BookReservation {
    private Member member;
    private BookItem bookItem;
    private Date reservationDate;
    private Notifiable notifiable;

    public BookReservation(Member member, BookItem bookItem, Date reservationDate, Notifiable notifiable) {
        this.member = member;
        this.bookItem = bookItem;
        this.reservationDate = reservationDate;
        this.notifiable = notifiable;
    }
    public void notifyReservation() {
        notifiable.sendNotification("Book reserved successfully");
    }
    
}
