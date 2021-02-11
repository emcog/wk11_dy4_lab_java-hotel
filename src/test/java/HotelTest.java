import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;

    @Before
    public void before(){
        hotel = new Hotel("California");
    }

    @Test
    public void hotelHasName(){
        assertEquals("California", hotel.getHotelName());
    }
//    hasname
//    has bedrooms
//    has conference rooms

}
