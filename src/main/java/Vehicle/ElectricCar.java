package Vehicle;

import Components.Battery;
import Components.Tires;

public class ElectricCar extends Vehicle{

    private Battery battery;

    public ElectricCar(String model, double price, String colour, Tires tires, int doors, Battery battery) {
        super(model, price, colour, tires, doors);
        this.battery = battery;
    }

    public Battery getBattery(){
        return this.battery;
    }

}
