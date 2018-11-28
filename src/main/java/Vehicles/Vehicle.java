package Vehicles;

public abstract class Vehicle {

    private String make;
    private String model;
    private int numberOfSeats;
    private int price;
    private int damage;

    public Vehicle(String make, String model, int numberOfSeats, int price, int damage){
        this.make = make;
        this.model = model;
        this.numberOfSeats = numberOfSeats;
        this.price = price;
        this.damage = damage;
    }

    public String getMake() {
        return this.make;
    }

    public String getModel() {
        return this.model;
    }

    public int getNumberOfSeats() {
        return this.numberOfSeats;
    }

    public int getPrice() {
        return this.price;
    }

    public int getDamage() {
        return this.damage;
    }

}
