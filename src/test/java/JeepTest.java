import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JeepTest {

    Jeep jeep;

    @Before
    public void setup(){
        jeep = new JeepTest("Ford", "Explorer", 7, 50000, 2300);
    }

    @Test
    public void hasMake(){
        assertEquals("Vauxhall", jeep.getMake());
    }

    @Test
    public void hasModel(){
        assertEquals("Astra", jeep.getModel());
    }

    @Test
    public void hasNumberOfSeats(){
        assertEquals(5, jeep.getNumberOfSeats());
    }

    @Test
    public void hasPrice(){
        assertEquals(6000, jeep.getPrice());
    }

    @Test
    public void hasDamage(){
        assertEquals(0, jeep.getDamage());
    }
}
