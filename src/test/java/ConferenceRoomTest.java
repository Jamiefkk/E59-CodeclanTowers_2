import Guest.Guest;
import Rooms.ConferenceRoom;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    ConferenceRoom conferenceRoom1;
    ConferenceRoom conferenceRoom2;
    ConferenceRoom conferenceRoom3;
    Guest guest1;
    Guest guest2;

    @Before
    public void setup(){
        conferenceRoom1 = new ConferenceRoom(3, "Bob Hope Room");
        guest1 = new Guest("John");
        guest2 = new Guest("Linda");
    }


    @Test
    public void canGetName(){
        assertEquals("Bob Hope Room", conferenceRoom1.getName());
    }
    @Test
    public void canSetName(){
        conferenceRoom1.setName("Bob Hope Memorial Room");
        assertEquals("Bob Hope Memorial Room", conferenceRoom1.getName());
    }
    @Test
    public void roomStartsEmpty(){
        assertEquals(0, conferenceRoom1.getTotalGuests());
    }
    @Test
    public void canAddGuest(){
        conferenceRoom1.addGuestToRoom(guest1);
        assertEquals(1, conferenceRoom1.getTotalGuests());
    }


}
