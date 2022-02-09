package Vehicle;

import Components.Engine;
import Components.Tires;

public class Car extends Vehicle{

    private Engine engine;

    public Car(String model, double price, String colour, Tires tires, int doors, Engine engine) {
        super(model, price, colour, tires, doors);
        this.engine = engine;
    }


    public Engine getEngine(){
        return this.engine;
    }
}
