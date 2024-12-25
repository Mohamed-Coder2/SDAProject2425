package Notifications;

import Model.Notification;

public class EmailNotification extends Notification {
    private String Subject;
    private String Body;

    public EmailNotification(String Body, String subject) {
        this.Body = Body;
        Subject = subject;
    }

    @Override
    public void send() {
        System.out.println("Subject: " + Subject + "Body: " + Body);
    }
    public String getSubject() {
        return Subject;
    }
    public void setSubject(String subject) {
        Subject = subject;
    }
    public String getBody() {
        return Body;
    }
    public void setBody(String body) {
        Body = body;
    }
}
