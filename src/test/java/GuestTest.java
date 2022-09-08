import Guest.Guest;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestTest {
    Guest guest1;
    Guest guest2;

    @Before
    public void setup() {
        guest1 = new Guest("John");
        guest2 = new Guest("Linda");
    }

    @Test
    public void guestHasName(){
        assertEquals("John", guest1.getName());
    }
}
