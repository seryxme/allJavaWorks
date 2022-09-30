package classwork.hotelmanagementsystem;

import java.util.ArrayList;
import java.util.List;

public class Hotel {

    private final String hotelName;
    private final String location;
    private List<Room> hotelRooms;
    private List<Customer> hotelCustomers;

    public Hotel(String hotelName, String location) {
        this.hotelName = hotelName;
        this.location = location;
        hotelRooms = new ArrayList<>();
        hotelCustomers = new ArrayList<>();
    }

    public String getHotelName() {
        return hotelName;
    }

    public String getLocation() {
        return location;
    }

    public void addRoom(Room room) {
        hotelRooms.add(room);
    }

    public int numOfRooms() {
        return hotelRooms.size();
    }

    public Room getRoom(int roomNumber) {
        for (Room room : hotelRooms) {
            if (room.getRoomNumber() == roomNumber) return room;
        }
        return  null;
    }

    public List<Room> getAllRooms() {
        return hotelRooms;
    }

    public void addCustomer(Customer customer) {
        customer.setCustomerId(hotelCustomers.size() + 1);
        hotelCustomers.add(customer);
    }

    public Customer getCustomer(int customerId) {
        return hotelCustomers.get(customerId - 1);
    }

    public List<Customer> getAllCustomers() {
        return hotelCustomers;
    }

    public int numOfCustomers() {
        return hotelCustomers.size();
    }

    public boolean isAvailable(Room room) {
        return room.isAvailable();
    }

    public void bookRoom(Customer customer, Room room) {
        if (customer.hasPaid()) {
            if(room.isAvailable()) {
                room.setAvailable(false);
                customer.setBookedRoom(room);
            } else System.out.println("Room is already booked. Please choose another room.");
        } else System.out.println("No payment made. Please make payment to book room.");
    }

    public void checkOutCustomer(Customer customer, Room room) {
        if (room.getDurationLeft() == 0) {
            customer.setPaymentStatus(false);
            room.setAvailable(true);
            customer.setBookedRoom(null);
        }
    }

    public void makePayment(Customer customer, Room room, double amountPaid) {
        if (room.getRoomPrice() <= amountPaid) {
            customer.setPaymentStatus(true);
        }
    }


}
