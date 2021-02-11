import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestTest {
    Guest guest;

    @Before
    public void before(){
        guest = new Guest("DeeDee");
    }

    @Test
    public void canGetName(){
        assertEquals("DeeDee", guest.getName());
    }

}
