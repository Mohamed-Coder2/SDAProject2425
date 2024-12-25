package Model;

public abstract class Notification {
    private int ID;
    private String type;
    private String recipient;

    public void send() {
        System.out.println("Notification from the Abstract Class");
    }
}
