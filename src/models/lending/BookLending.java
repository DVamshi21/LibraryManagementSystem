package models.lending;

import java.lang.reflect.Member;
import java.util.Date;

import models.books.BookItem;
import interfaces.Notifiable;

public class BookLending {
    private BookItem bookItem;
    private Date dueDate;
    private Member member;
    private Notifiable notifiable;

    public BookLending(BookItem bookItem,  Member member, Date dueDate, Notifiable notifiable) {
        this.bookItem = bookItem;
        this.dueDate = dueDate;
        this.member = member;
        this.notifiable = notifiable;
    }
    public void notifyLending() {
        notifiable.sendNotification("Book Lending successful");
    }

    public Member getMember() {
        return member;
    }
    public void returnBook() {
        bookItem.returnBook();
    }
    public BookItem getBookItem() {
        return bookItem;
    }
    public Date getDueDate() {
        return dueDate;
    }
}
