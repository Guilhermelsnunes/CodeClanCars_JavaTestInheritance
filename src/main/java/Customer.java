import Vehicle.Vehicle;

import java.util.ArrayList;

public class Customer {

    private double money;
    private ArrayList<Vehicle> vehicles;


    public Customer(double money) {
        this.money = money;
        this.vehicles = new ArrayList<Vehicle>();
    }

    public double getMoney() {
        return money;
    }

    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }

    public int getNumberOfCars(){
        return vehicles.size();
    }

    public void buyVehicle(Vehicle vehicle){
        vehicles.add(vehicle);
    }

}
