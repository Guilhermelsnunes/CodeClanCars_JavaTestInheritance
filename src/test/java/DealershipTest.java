import Components.Engine;
import Components.Tires;
import Vehicle.Car;
import Vehicle.Vehicle;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class DealershipTest {

    Dealership dealership;


    @Before
    public void before(){
        dealership = new Dealership(500000.00);

    }

    @Test
    public void hasTill(){
        assertEquals(500000.00,dealership.getTill(),0.00);
    }

    @Test
    public void hasStock(){
        assertEquals(0, dealership.getNumberOfCars());
    }

    @Test
    public void canBuyVehicles(){
        Engine engine = new Engine(5.0);
        Tires tires = new Tires("Pirelli", 120.00);
        Car car = new Car ("Lambo",250000.00,"lime green", tires,2, engine);
        Car car2 = new Car ("Lambo",250000.00,"red", tires,2, engine);
        Car car3 = new Car ("Lambo",250000.00,"black", tires,2, engine);
        ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>(Arrays.asList(car, car2, car3));
        dealership.buyVehicles(vehicles);
        assertEquals(3,dealership.getNumberOfCars());

    }
}
