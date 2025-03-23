package services;

import java.lang.reflect.Member;
import java.sql.Date;
import java.util.List;
import interfaces.Notifiable;
import models.books.BookItem;
import models.lending.BookLending;

public class BookLendingService {
    public void LendBook(BookItem bookitem,Member member, Date dueDate,Notifiable notifiable) {
        BookLending bookLending = new BookLending(bookitem, member,dueDate,notifiable);
        bookLending.notifyLending();
        
    }

  

 
    
}
