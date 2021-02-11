import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {
    Bedroom bedroom;

//    room number
//    room type

    @Before
    public void before(){
        bedroom = new Bedroom(01, "single" );
    }

    @Test
    public void hasRoomNumber(){
        assertEquals(01, bedroom.getRoomNumber());
    }

    @Test
    public void hasRoomType(){
        assertEquals("single", bedroom.getBedroomType());
    }

}
