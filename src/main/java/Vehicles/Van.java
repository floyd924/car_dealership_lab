package Vehicles;

import Interfaces.ITow;

public class Van extends Vehicle implements ITow {

    public Van(String make, String model, int numberOfSeats, int price, int damage){
        super(make, model, numberOfSeats, price, damage);
    }

    public String tow(String trailer){
        return "Van is now towing a " + trailer;
    }

    public String drive(){
        return "chuggachuggachugga";
    }
}
