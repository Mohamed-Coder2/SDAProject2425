package Model;

public class User {
    private int ID;
    private String Name;
    private String Email;
    private int Phone;

    public User(int ID, String name, String email, int phone) {
        this.ID = ID;
        Name = name;
        Email = email;
        Phone = phone;
    }
    public int getID() {return ID;}
    public void setID(int ID) {this.ID = ID;}
    public String getName() {return Name;}
    public void setName(String name) {Name = name;}
    public String getEmail() {return Email;}
    public void setEmail(String email) {Email = email;}
    public int getPhone() {return Phone;}
    public void setPhone(int phone) {Phone = phone;}
}
