import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    ConferenceRoom conferenceRoom;

    @Before
    public void before(){
        conferenceRoom = new ConferenceRoom("Iggy Hall", 20);
    }

    @Test
    public void conferenceRoomHasName(){
        assertEquals("Iggy Hall", conferenceRoom.getConferenceRoomName());
    }
}
