package classwork.hotelmanagementsystem;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HotelTest {
    Hotel hotel;
    Room room;
    Customer customer;
    Customer customer2;

    @BeforeEach
    void setUp() {
        hotel = new Hotel("New World Hotel", "Yaba, Lagos");
        room = new Room(001, "Exquisite");
        customer = new Customer("Dee Jay", "08012345678", "deejay@gmail.com");
        customer2 = new Customer("Tee Jay", "08012345890", "teejay@gmail.com");
    }

    @Test
    void testThatHotelHasRooms() {
        hotel.addRoom(room);
        assertEquals(1, hotel.numOfRooms());
    }

    @Test
    void testThatHotelHasCustomers() {
        hotel.addCustomer(customer);
        assertEquals(1, hotel.numOfCustomers());
        assertEquals("Dee Jay", hotel.getCustomer(1).getFullName());
    }

    @Test
    void testThatRoomIsAvailable() {
        hotel.addRoom(room);
        assertTrue(hotel.isAvailable(room));

    }

    @Test
    void testThatCustomerCanBookRoom_andRoomIsUnavailable() {
        room.setRoomPrice(10000.00);
        hotel.addRoom(room);
        assertTrue(hotel.isAvailable(room));

        hotel.addCustomer(customer);
        hotel.makePayment(customer, room, 10000.00);
        hotel.bookRoom(customer, room);

        assertFalse(hotel.isAvailable(room));
    }

    @Test
    void testThatRoomCannotBeBookedAfterBeingOccupied() {
        room.setRoomPrice(10000.00);
        hotel.addRoom(room);
        assertTrue(hotel.isAvailable(room));

        hotel.addCustomer(customer);
        hotel.addCustomer(customer2);
        hotel.makePayment(customer, room, 10000.00);
        hotel.bookRoom(customer, room);

        hotel.makePayment(customer2, room, 10000.00);
        hotel.bookRoom(customer2, room);
        assertNull(hotel.getCustomer(2).getBookedRoom());
    }

    @Test
    void testThatRoomCannotBeBookedWithoutPayment() {
        room.setRoomPrice(10000.00);
        hotel.addRoom(room);
        assertTrue(hotel.isAvailable(room));

        hotel.addCustomer(customer);
        hotel.bookRoom(customer, room);

        assertNull(hotel.getCustomer(1).getBookedRoom());
    }

    @Test
    void testThatRoomIsAvailableAfterCustomerChecksOut() {
        hotel.addRoom(room);
        hotel.addCustomer(customer);
        hotel.makePayment(customer, room, 10000.00);
        hotel.bookRoom(customer, room);
        hotel.checkOutCustomer(customer, room);
        assertTrue(hotel.isAvailable(room));
    }

}