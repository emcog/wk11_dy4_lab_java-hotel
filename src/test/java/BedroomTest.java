import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {
    Bedroom bedroom;

    @Before
    public void before(){
        bedroom = new Bedroom(01, BedRoomType.SINGLE );
    }

    @Test
    public void hasRoomNumber(){
        assertEquals(01, bedroom.getRoomNumber());
    }

    @Test
    public void hasRoomType(){
        assertEquals(BedRoomType.SINGLE, bedroom.getBedroomType());
    }

//    @Test
//    public void roomStartsEmpty(){
//        assertEquals(0, bedroom.getCapacity());
//    }

}
