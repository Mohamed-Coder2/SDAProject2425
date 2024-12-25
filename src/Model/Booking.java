package Model;

public abstract class Booking {
    private int ID;
    private int UserID;
    private int itemID;
    private String itemType;
    private String Status;

    public Booking(int ID, int userID, int itemID, String itemType, String status) {
        this.ID = ID;
        UserID = userID;
        this.itemID = itemID;
        this.itemType = itemType;
        Status = status;
    }

    public int getID() {return ID;}
    public void setID(int ID) {this.ID = ID;}
    public int getUserID() {return UserID;}
    public void setUserID(int userID) {UserID = userID;}
    public int getItemID() {return itemID;}
    public void setItemID(int itemID) {this.itemID = itemID;}
    public String getItemType() {return itemType;}
    public void setItemType(String itemType) {this.itemType = itemType;}
    public String getStatus() {return Status;}
    public void setStatus(String status) {Status = status;}
}
