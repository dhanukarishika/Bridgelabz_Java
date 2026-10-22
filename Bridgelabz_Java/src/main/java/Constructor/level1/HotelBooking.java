/*
 * Q4. Hotel Booking System
 * Create a HotelBooking class using default,
 * parameterized, and copy constructors.
 */
package Constructor.level1;
public class HotelBooking {
    private String guestName;
    private String roomType;
    private int nights;
    public HotelBooking()
    {
        this("Guest", "Standard", 1);
    }
    public HotelBooking(String guestName, String roomType, int nights) {
        setGuestName(guestName);
        setRoomType(roomType);
        setNights(nights);
    }
    public HotelBooking(HotelBooking other) {
        if (other == null) {
            throw new IllegalArgumentException(
                    "Booking to copy cannot be null."
            );
        }
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
    }
    public String getGuestName() {
        return guestName;
    }
    public void setGuestName(String guestName) {
        if (guestName == null || guestName.trim().isEmpty()) {
            throw new IllegalArgumentException("Guest name cannot be empty.");
        }
        this.guestName = guestName.trim();
    }
    public String getRoomType() {
        return roomType;
    }
    public void setRoomType(String roomType) {
        if (roomType == null || roomType.trim().isEmpty()) {
            throw new IllegalArgumentException("Room type cannot be empty.");
        }
        this.roomType = roomType.trim();
    }
    public int getNights() {
        return nights;
    }
    public void setNights(int nights) {
        if (nights <= 0) {
            throw new IllegalArgumentException(
                    "Number of nights must be positive."
            );
        }
        this.nights = nights;
    }
    public void displayDetails() {
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Nights: " + nights);
    }
    public static void main(String[] args) {
        HotelBooking defaultBooking = new HotelBooking();
        HotelBooking customBooking =
                new HotelBooking("Rishika Dhanuka", "Deluxe", 3);
        HotelBooking copiedBooking = new HotelBooking(customBooking);
        System.out.println("Default Booking");
        defaultBooking.displayDetails();
        System.out.println("\nParameterized Booking");
        customBooking.displayDetails();
        System.out.println("\nCopied Booking");
        copiedBooking.displayDetails();
    }
}