package Vehicle;

import Components.Battery;
import Components.Engine;
import Components.Tires;

public class HybridCar extends Vehicle{

    private Battery battery;
    private Engine engine;

    public HybridCar(String model, double price, String colour, Tires tires, int doors, Battery battery, Engine engine) {
        super(model, price, colour, tires, doors);
        this.battery = battery;
        this.engine = engine;
    }

    public Engine getEngine(){
        return this.engine;
    }

    public Battery getBattery(){
        return this.battery;
    }
}
