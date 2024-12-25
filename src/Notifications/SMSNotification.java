package Notifications;

import Model.Notification;

public class SMSNotification extends Notification {
    private String message;
    @Override
    public void send() {
        System.out.println("SMS Notification");
    }

    public SMSNotification(String message) {
        this.message = message;
    }
}
