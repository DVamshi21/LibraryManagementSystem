import java.util.List;

import interfaces.Notifiable;
import interfaces.PaymentMethod;
import models.books.Book;
import models.books.BookItem;
import models.notifications.EmailNotification;
import models.notifications.PostalNotification;
import models.people.Member;
import models.transactions.CashTransaction;
import models.transactions.CheckTransaction;
import services.BookLendingService;
import services.BookReservationService;
import services.FineService;

public class App {
    public static void main(String[] args) throws Exception {
        Book book = new Book("The Alchemist","New", "Paulo Coelho",1988, null);

        BookItem bookItem = new BookItem("1234", "The Alchemist");
       


        Member member = new Member("John", "Doe", "909090909090");
       

        Notifiable emailNotification = new EmailNotification("vamshi@gmail.com");
        
        Notifiable postalNotification = new PostalNotification("West marredpally");
       

        PaymentMethod cashPayment = new CashTransaction(100);
       
        List<BookItem> bookItems = List.of(bookItem);
        PaymentMethod checkPayment = new CheckTransaction("CHCK-1234");
     
        FineService fineService = new FineService();
        BookLendingService bookLendingService = new BookLendingService();
        BookReservationService bookReservationService = new BookReservationService();

        System.out.println("processing fine");
        fineService.ProcessFine(100, cashPayment, emailNotification);
        System.out.println("lending book");
        // bookLendingService.LendBook(member, bookItems, emailNotification);
        System.out.println("reserving book");       
        bookReservationService.ReserveBook(member, bookItem, postalNotification);



    }
}
