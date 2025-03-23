package models.security;

public class LibraryCard {
    private String cardNumber;
    private boolean isActive;

    public LibraryCard(String cardNumber) {
        this.cardNumber = cardNumber;
        this.isActive = true;
    }
    public void deactivate() {
        this.isActive = false;
    }
    
}
