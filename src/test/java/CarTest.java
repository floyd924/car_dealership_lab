import Vehicles.Car;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarTest {

    Car car;

    @Before
    public void setup(){
        car = new Car("Vauxhall", "Astra", 5, 6000, 0);
    }

    @Test
    public void hasMake(){
        assertEquals("Vauxhall", car.getMake());
    }

    @Test
    public void hasModel(){
        assertEquals("Astra", car.getModel());
    }

    @Test
    public void hasNumberOfSeats(){
        assertEquals(5, car.getNumberOfSeats());
    }

    @Test
    public void hasPrice(){
        assertEquals(6000, car.getPrice());
    }

    @Test
    public void hasDamage(){
        assertEquals(0, car.getDamage());
    }
}
