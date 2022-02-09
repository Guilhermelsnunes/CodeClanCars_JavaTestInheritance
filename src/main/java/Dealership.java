import Vehicle.Vehicle;

import java.util.ArrayList;

public class Dealership {

    private ArrayList<Vehicle> stock;
    private double till;

    public Dealership(double till) {
        this.stock = new ArrayList<Vehicle>();
        this.till = till;
    }

    public ArrayList<Vehicle> getStock() {
        return stock;
    }

    public double getTill() {
        return till;
    }

    public int getNumberOfCars(){
        return stock.size();
    }

    public void buyVehicles(ArrayList<Vehicle> vehicles){
        stock.addAll(vehicles);
    }
}
