package classwork.hotelmanagementsystem;

public class Room {
    private final int roomNumber;
    private String roomType;
    private double roomPrice;
    private boolean isAvailable = true;

    public Room(int roomNumber, String roomType, double roomPrice) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.roomPrice = roomPrice;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public double getRoomPrice() {
        return roomPrice;
    }

    public void setRoomPrice(double roomPrice) {
        this.roomPrice = roomPrice;
    }

    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public int getDurationLeft() {
        return 0;
    }

    @Override
    public String toString() {
        return String.format("""
                ROOM NO.: %d
                ROOM TYPE: %s
                ROOM PRICE: %,.2f
                ROOM AVAILABLE: %s
                """, getRoomNumber(), getRoomType(), getRoomPrice(), isAvailable() ? "Yes": "No");
    }
}
