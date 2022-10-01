package classwork.hotelmanagementsystem;

public class Customer {
    private int customerId;
    private final String fullName;
    private String phoneNumber;
    private String email;
    private Room bookedRoom;
    private boolean hasPaid;

    public Customer(String fullName, String phoneNumber, String email) {
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getFullName() {
        return fullName;
    }

    public Room getBookedRoom() {
        return bookedRoom;
    }

    public void setBookedRoom(Room bookedRoom) {
        this.bookedRoom = bookedRoom;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean hasPaid() {
        return hasPaid;
    }

    public void setPaymentStatus(boolean status) {
        hasPaid = status;
    }

    @Override
    public String toString() {
        return String.format("""
                CUSTOMER NO.: %d
                CUSTOMER NAME: %s
                CUSTOMER PHONE NUMBER: %s
                CUSTOMER EMAIL: %s
                CUSTOMER BOOKED ROOM: %s
                """, getCustomerId(), getFullName(), getPhoneNumber(), getEmail(), getBookedRoom());
    }
}
