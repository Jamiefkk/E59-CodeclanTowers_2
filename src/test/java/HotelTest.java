import Guest.Guest;
import Rooms.Bedroom;
import Rooms.ConferenceRoom;
import Rooms.Room;
import Rooms.RoomType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class HotelTest {
    Hotel hotel;
    Bedroom bedroom1;
    Bedroom bedroom2;
    Bedroom bedroom3;
    Guest guest1;
    Guest guest2;
    Guest guest3;
    ConferenceRoom conferenceRoom1;

    @Before
    public void setUp(){
        hotel = new Hotel("Balmoral");
        bedroom1 = new Bedroom(1, RoomType.DOUBLE);
        guest1 = new Guest("John");
        guest2 = new Guest("Linda");
        guest3 = new Guest("Declan");
        conferenceRoom1 = new ConferenceRoom(3, "Bob Hope Room");
    }
    @Test
    public void canGetName() {
        assertEquals("Balmoral", hotel.getName());
    }

    @Test
    public void canAddRooms(){
        assertEquals(0, hotel.getTotalBedrooms());
        assertEquals(0, hotel.getTotalConferenceRooms());
        hotel.addBedroom(bedroom1);
        hotel.addConferenceRoom(conferenceRoom1);
        assertEquals(1, hotel.getTotalBedrooms());
        assertEquals(1, hotel.getTotalConferenceRooms());
    }
    @Test
    public void canAddGuestToBedroom(){
        hotel.addBedroom(bedroom1);
        hotel.bedroomCheckIn(bedroom1, guest1);
        hotel.bedroomCheckIn(bedroom1, guest2);
        hotel.bedroomCheckIn(bedroom1, guest3);
        assertEquals(bedroom1.getTotalGuests(), 2);
    }
    @Test
    public void canAddToConferenceRoom(){
        hotel.addConferenceRoom(conferenceRoom1);
        hotel.conferenceRoomCheckIn(conferenceRoom1, guest1);
        hotel.conferenceRoomCheckIn(conferenceRoom1, guest2);
        hotel.conferenceRoomCheckIn(conferenceRoom1, guest3);
        assertEquals(conferenceRoom1.getTotalGuests(), 3);
    }

//    @Test
//    public void canDoBedroomCheckIn(){
//
//    }
}
