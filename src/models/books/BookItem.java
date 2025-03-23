package models.books;
import java.util.Date;
public class BookItem {
    private boolean isAvailable;

    public BookItem(String ISBN, String title) {
        this.isAvailable = true;
    }
    public boolean checkout() {
        if(isAvailable) {
            isAvailable = false;
            return true;
        }
        return false;
    }
    public void returnBook() {
        isAvailable = true;
    }
}
