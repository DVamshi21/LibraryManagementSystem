package models.notifications;

import interfaces.Notifiable;

public class EmailNotification implements Notifiable {
    private String email;

    public EmailNotification(String email) {
        this.email = email;
    }

    @Override
    public void sendNotification(String message) {

        System.out.println("Sending email notification: " +email+ " " + message);
   
        
    }
    
}
