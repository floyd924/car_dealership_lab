package Dealership;

import Interfaces.IDrive;
import Vehicles.Car;
import Vehicles.Vehicle;

import java.util.ArrayList;

public class Dealership {

    private ArrayList<Vehicle> garage;

    public Dealership(){
        this.garage = new ArrayList<>();
    }


    public void addVehicleToGarage(Vehicle vehicle) {
        this.garage.add(vehicle);
    }

    public int getVehicleCount(){
        return this.garage.size();
    }

    public int getPriceOfFirstVehicle(){
        return this.garage.get(0).getPrice();
    }

//    public String driveFirstVehicle() {
//        return this.garage.get(0).drive();
//    }
}
