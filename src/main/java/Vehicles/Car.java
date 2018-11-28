package Vehicles;

import Interfaces.IDrive;
import Interfaces.IFast;

public class Car extends Vehicle implements IDrive, IFast {

    public Car(String make, String model, int numberOfSeats, int price, int damage){
        super(make, model, numberOfSeats, price, damage);
    }

    public String drive(){
        return "brum brum";
    }

    public int maxSpeed(){
        return 150;
    }

}
