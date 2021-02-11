import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    ConferenceRoom conferenceRoom;
    Guest guest;

    @Before
    public void before(){
        conferenceRoom = new ConferenceRoom("Iggy Hall", 20);

    }

    @Test
    public void conferenceRoomHasName(){
        assertEquals("Iggy Hall", conferenceRoom.getConferenceRoomName());
    }

    @Test
    public void roomHasCapacity(){
        assertEquals(20, conferenceRoom.getCapacity());
    }

    @Test
    public void conferenceRoomStartsEmpty(){
        assertEquals(0, conferenceRoom.getGuestCount());
    }


    @Test
    public void canAddGuestToConferenceRoom(){
        conferenceRoom.addGuest(guest);
        assertEquals(1, conferenceRoom.getGuestCount());
    }
}
