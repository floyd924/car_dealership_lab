import Vehicles.Van;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VanTest {

    Van van;

    @Before
    public void setup(){
        van = new Van("Mercedes", "Sprinter", 3, 12000, 8000);
    }

    @Test
    public void hasMake(){
        assertEquals("Mercedes", van.getMake());
    }

    @Test
    public void hasModel(){
        assertEquals("Sprinter", van.getModel());
    }

    @Test
    public void hasNumberOfSeats(){
        assertEquals(3, van.getNumberOfSeats());
    }

    @Test
    public void hasPrice(){
        assertEquals(12000, van.getPrice());
    }

    @Test
    public void hasDamage(){
        assertEquals(8000, van.getDamage());
    }

    @Test
    public void canTow(){
        assertEquals("Van is now towing a caravan", van.tow("caravan"));
    }

    @Test
    public void canDrive(){
        assertEquals("chuggachuggachugga", van.drive());
    }
}
