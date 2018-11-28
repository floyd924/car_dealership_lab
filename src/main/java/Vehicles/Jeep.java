package Vehicles;

import Interfaces.ITow;

public class Jeep extends Vehicle implements ITow {

    public Jeep(String make, String model, int numberOfSeats, int price, int damage){
        super(make, model, numberOfSeats, price, damage);
    }

    public String tow(String trailer){
        return "Now towing a " + trailer;
    }

    public String drive(){
        return "brrmm";
    }


}
