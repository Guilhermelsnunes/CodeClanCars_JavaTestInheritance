package Vehicle;

import Components.Tires;

public abstract class Vehicle {
    private String model;
    private double price;
    private String colour;
    private Tires tires;
    private int doors;

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public String getColour() {
        return colour;
    }

    public Tires getTires() {
        return tires;
    }

    public int getDoors() {
        return doors;
    }

    public Vehicle(String model, double price, String colour, Tires tires, int doors) {
        this.model = model;
        this.price = price;
        this.colour = colour;
        this.tires = tires;
        this.doors = doors;
    }
}
