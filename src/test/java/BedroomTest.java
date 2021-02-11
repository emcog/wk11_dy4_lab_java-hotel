import org.junit.Before;
import org.junit.Test;
import people.Guest;
import rooms.BedRoomType;
import rooms.Bedroom;

import static org.junit.Assert.assertEquals;

public class BedroomTest {
    Bedroom bedroom;
    Guest guest;

    @Before
    public void before(){
        bedroom = new Bedroom(01, 01, BedRoomType.SINGLE );
        guest = new Guest("Boy George" );
    }

    @Test
    public void hasRoomNumber(){
        assertEquals(01, bedroom.getRoomNumber());
    }

    @Test
    public void hasRoomType(){
        assertEquals(BedRoomType.SINGLE, bedroom.getBedroomType());
    }


    @Test
    public void bedRoomStartsEmpty(){
        assertEquals(0, bedroom.getGuestCount());
    }



    @Test
    public void canAddGuestToBedRoom(){
        bedroom.addGuest(guest);
        assertEquals(1, bedroom.getGuestCount());
    }

}