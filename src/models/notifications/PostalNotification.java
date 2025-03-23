package models.notifications;

import interfaces.Notifiable;

public class PostalNotification implements Notifiable {

    private String address;

    public PostalNotification(String address) {
        this.address = address;
    }

    @Override
    public void sendNotification(String message) {
      

        System.out.println("Sending postal notification: " + address + " " + message);
        
    }
    
}
