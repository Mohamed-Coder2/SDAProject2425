package BookingTypes;

import Model.Booking;

import java.util.List;

public class Hotel extends Booking {
    private int ID;
    private String Name;
    private String Location;
    private String RoomTypes;

    public Hotel(int ID, int userID, int itemID, String itemType, String status) {
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
    public String getRoomTypes() {return RoomTypes;}
    public void setRoomTypes(String roomTypes) {RoomTypes = roomTypes;}

    // Added recommendation logic
    public void recommendEvents(List<String> events) {
        System.out.println("Recommended events for location " + Location + ":");
        for (String event : events) {
            System.out.println("- " + event);
        }
    }
}
