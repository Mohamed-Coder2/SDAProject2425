package utils;

import java.util.ArrayList;
import java.util.List;

public class APIIntegration {
    public List<String> fetchEvents(String location) {
        // Placeholder for external API call
        System.out.println("Fetching events for location: " + location);
        List<String> events = new ArrayList<>();
        events.add("Music Festival");
        events.add("Art Exhibition");
        events.add("Local Food Market");
        return events;
    }

    public void fetchHotelDetails(String location) {
        // Placeholder for hotel provider API call
        System.out.println("Fetching hotel details for location: " + location);
    }
}