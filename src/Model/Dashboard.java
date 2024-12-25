package Model;

import Manager.BookingManager;
import java.util.List;

public class Dashboard {
    private BookingManager bookingManager;

    public Dashboard(BookingManager bookingManager) {
        this.bookingManager = bookingManager;
    }

    public void displayUserBookings(int userID) {
        List<Booking> userBookings = bookingManager.searchBookings(userID);
        System.out.println("User Bookings:");
        for (Booking booking : userBookings) {
            System.out.println("- ID: " + booking.getID() + ", Type: " + booking.getItemType() + ", Status: " + booking.getStatus());
        }
    }
}
