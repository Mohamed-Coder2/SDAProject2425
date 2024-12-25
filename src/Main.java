import BookingTypes.Hotel;
import Manager.BookingManager;
import Model.Dashboard;
import Model.Notification;
import Notifications.EmailNotification;
import Notifications.SMSNotification;
import utils.APIIntegration;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Notification> NotificationQueue = new LinkedList<>();
        Notification email = new EmailNotification("Test Body", "Test Subject");
        Notification sms = new SMSNotification("Test SMS Message");

        NotificationQueue.add(email);
        NotificationQueue.add(sms);

        while (!NotificationQueue.isEmpty()) {
            Notification notification = NotificationQueue.poll();
            notification.send();
        }

        // Added booking manager and API integration logic
        BookingManager bookingManager = new BookingManager(); // Added
        APIIntegration apiIntegration = new APIIntegration(); // Added

        // Create sample bookings (Added)
        Hotel hotelBooking = new Hotel(1, 101, 201, "Hotel", "Confirmed");
        hotelBooking.setLocation("Cairo");
        bookingManager.addBooking(hotelBooking);

        // Fetch and recommend events (Added)
        hotelBooking.recommendEvents(apiIntegration.fetchEvents("Cairo"));

        // Display user dashboard (Added)
        Dashboard dashboard = new Dashboard(bookingManager);
        dashboard.displayUserBookings(101);
    }
}