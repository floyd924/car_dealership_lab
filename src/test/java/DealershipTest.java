import Dealership.Dealership;
import Vehicles.Car;
import Vehicles.Jeep;
import Vehicles.Van;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DealershipTest {

    Dealership floyds;
    Car car1;
    Van van1;
    Jeep jeep1;

    @Before
    public void setup(){
        floyds = new Dealership();
        car1 = new Car("VW", "Golf", 4, 18000, 0);
        van1 = new Van("VW", "Transporter", 2, 10000, 3000);
        jeep1 = new Jeep("Subaru", "Forrester", 5, 21000, 0);
    }

    @Test
    public void canAddToGarage(){
        floyds.addVehicleToGarage(car1);
        assertEquals(1, floyds.getVehicleCount());
    }

    @Test
    public void canAddMultipleVehiclesToGarage(){
        floyds.addVehicleToGarage(car1);
        floyds.addVehicleToGarage(van1);
        floyds.addVehicleToGarage(jeep1);
        assertEquals(3, floyds.getVehicleCount());
    }

    @Test
    public void canGetPriceOfFirstVehicle(){
        floyds.addVehicleToGarage(car1);
        floyds.addVehicleToGarage(van1);
        floyds.addVehicleToGarage(jeep1);
        assertEquals(18000, floyds.getPriceOfFirstVehicle());
    }

    @Test
    public void firstVehicleCanDrive(){
        floyds.addVehicleToGarage(car1);
        floyds.addVehicleToGarage(van1);
        floyds.addVehicleToGarage(jeep1);
        assertEquals("brum brum", floyds.driveFirstVehicle());
    }


}
