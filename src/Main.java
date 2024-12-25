import Model.Notification;
import Notifications.EmailNotification;
import Notifications.SMSNotification;

import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Notification> NotificationQueue = null;
        Notification email = new EmailNotification("Test Body","Test Subject");
        Notification sms = new SMSNotification("Test SMS Message");

        NotificationQueue.add(email);
    }
}