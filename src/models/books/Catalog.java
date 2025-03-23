package models.books;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class Catalog {
    private Map<String, Book> booksByISBN = new HashMap<>();
    private Map<String, List<Book>> booksByTitle = new HashMap<>(); 
    
    public void addBook(Book book) {
        booksByISBN.put(book.getIsbn(), book);
        booksByTitle.computeIfAbsent(book.getTitle(), k -> new ArrayList<>()).add(book);
    }
     public void removeBook(Book book) {
        booksByISBN.remove(book.getIsbn());
     }  
     public Book searchByISBN(String isbn) {
        return booksByISBN.get(isbn);
     }
     public List<Book> searchByTitle(String title) {
        return booksByISBN.values().stream().filter(book -> book.getTitle().equals(title)).toList();
    }

    
}
