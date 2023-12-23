import java.util.HashMap;
import java.util.Map;

public class HotelBooking {

    public static String findMaxBookedRoom(String[] bookings) {
        Map<String, Integer> roomCount = new HashMap<>();
        String maxBookedRoom = "";
        int maxCount = 0;

        for (String booking : bookings) {
            char operation = booking.charAt(0);
            String room = booking.substring(1);

            if (operation == '+') {
                roomCount.put(room, roomCount.getOrDefault(room, 0) + 1);
                if (roomCount.get(room) > maxCount || (roomCount.get(room) == maxCount && room.compareTo(maxBookedRoom) < 0)) {
                    maxCount = roomCount.get(room);
                    maxBookedRoom = room;
                }
            } else if (operation == '-') {
                roomCount.put(room, roomCount.getOrDefault(room, 0) - 1);
            }
        }

        return maxBookedRoom;
    }

    public static void main(String[] args) {
        String[] bookings = {"+1A", "+3E", "-1A", "+4F", "+1A", "-3E"};
        String result = findMaxBookedRoom(bookings);
        System.out.println("The room booked the maximum number of times is: " + result);
    }
}
