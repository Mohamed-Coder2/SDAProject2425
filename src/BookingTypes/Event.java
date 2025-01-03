package BookingTypes;

import Model.Booking;

public class Event extends Booking {
    private int ID;
    private String Name;
    private String Location;
    private int Date;

    public Event(int ID, int userID, int itemID, String itemType, String status) {
        super(ID, userID, itemID, itemType, status);
    }

    @Override
    public int getID() {return ID;}
    @Override
    public void setID(int ID) {this.ID = ID;}

    public String getName() {return Name;}
    public void setName(String name) {Name = name;}
    public String getLocation() {return Location;}
    public void setLocation(String location) {Location = location;}
    public int getDate() {return Date;}
    public void setDate(int date) {Date = date;}
}
