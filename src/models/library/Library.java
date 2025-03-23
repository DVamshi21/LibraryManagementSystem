package models.library;

import models.books.BookItem;
import java.util.List;
public class Library {

    
    private String name;
    private String address; 
    private List<BookItem> books;

    public Library(String name, String address) {
        this.name = name;
        this.address = address;
    
    }
    public void addBook(BookItem book) {
        books.add(book);
    }
    public void removeBook(BookItem book) {
        books.remove(book);
    }
    public List<BookItem> getBooks() {
        return books;
    }

    
}
