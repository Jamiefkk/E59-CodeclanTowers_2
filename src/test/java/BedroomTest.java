import Guest.Guest;
import Rooms.Bedroom;
import Rooms.RoomType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {


    Bedroom bedroom1;
    Bedroom bedroom2;
    Bedroom bedroom3;
    Guest guest1;
    Guest guest2;

    @Before
    public void setUp(){
        bedroom1 = new Bedroom(1, RoomType.DOUBLE);
        guest1 = new Guest("John");
        guest2 = new Guest("Linda");
    }
    @Test
    public void roomStartsEmpty(){
        assertEquals(0, bedroom1.getTotalGuests());
    }
    @Test
    public void canAddGuest(){
        bedroom1.addGuestToRoom(guest1);
        assertEquals(1, bedroom1.getTotalGuests());
    }
    @Test
    public void bedroomHasNumber(){
        assertEquals(1, bedroom1.getRoomNumber());
    }

    @Test
    public void getCapacity(){
        assertEquals(2, bedroom1.getCapacity());
    }
    @Test
    public void canRemoveActualGuest(){
        bedroom1.addGuestToRoom(guest1);
        assertEquals(1, bedroom1.getTotalGuests());
        bedroom1.removeGuestFromRoom(guest2);
        assertEquals(1, bedroom1.getTotalGuests());
        bedroom1.removeGuestFromRoom(guest1);
        assertEquals(0, bedroom1.getTotalGuests());
    }
}
