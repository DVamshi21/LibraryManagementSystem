package models.security;

public class Account {
    private String username;
    private String password;
    private boolean isActive;

    public Account(String username, String password) {
        this.username = username;
        this.password = password;
        this.isActive = true;
        
    }
    public String getUsername() {
        return username;
    }

    public boolean isActive() {
        return isActive;
    }
    public boolean authenticate(String inputPasswordString) {
        return this.password.equals(inputPasswordString);   
    }
    
}
