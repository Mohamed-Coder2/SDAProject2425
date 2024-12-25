package Manager;

import Model.Booking;
import java.util.ArrayList;
import java.util.List;

public class BookingManager {
    private List<Booking> bookings = new ArrayList<>();

    public void addBooking(Booking booking) {
        bookings.add(booking);
        System.out.println("Booking added: " + booking.getID());
    }

    public void updateBooking(int id, String status) {
        for (Booking booking : bookings) {
            if (booking.getID() == id) {
                booking.setStatus(status);
                System.out.println("Booking updated: " + id);
                return;
            }
        }
        System.out.println("Booking not found: " + id);
    }

    public void deleteBooking(int id) {
        bookings.removeIf(booking -> booking.getID() == id);
        System.out.println("Booking deleted: " + id);
    }

    public List<Booking> searchBookings(int userID) {
        List<Booking> userBookings = new ArrayList<>();
        for (Booking booking : bookings) {
            if (booking.getUserID() == userID) {
                userBookings.add(booking);
            }
        }
        return userBookings;
    }
}
