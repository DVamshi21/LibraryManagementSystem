package models.books;

import models.people.Author;
import java.util.List;

public class Book {
    private String title;
    private String author;
    private String isbn;
    private List<Author> authors;
    private int publicationYear;
    private boolean isAvailable;

  
    public Book(String title, String author, String isbn, int publicationYear,List<Author> authors) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.publicationYear = publicationYear;
        this.isAvailable = true; 
    }

    
    public String getTitle() {
        return title;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public String getAuthor() {
        return author;
    }

    

    public String getIsbn() {
        return isbn;
    }

   

    public int getPublicationYear() {
        return publicationYear;
    }

   



    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isbn='" + isbn + '\'' +
                ", publicationYear=" + publicationYear +
                ", isAvailable=" + isAvailable +
                '}';
    }
}