import Vehicles.Jeep;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JeepTest {

    Jeep jeep;

    @Before
    public void setup(){
        jeep = new Jeep("Ford", "Explorer", 7, 50000, 2300);
    }

    @Test
    public void hasMake(){
        assertEquals("Ford", jeep.getMake());
    }

    @Test
    public void hasModel(){
        assertEquals("Explorer", jeep.getModel());
    }

    @Test
    public void hasNumberOfSeats(){
        assertEquals(7, jeep.getNumberOfSeats());
    }

    @Test
    public void hasPrice(){
        assertEquals(50000, jeep.getPrice());
    }

    @Test
    public void hasDamage(){
        assertEquals(2300, jeep.getDamage());
    }

    @Test
    public void canTow(){
        assertEquals("Now towing a horsebox", jeep.tow("horsebox"));
    }

    @Test
    public void canDrive(){
        assertEquals("brrmm", jeep.drive());
    }
}
