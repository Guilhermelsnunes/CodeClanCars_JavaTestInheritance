import Components.Engine;
import Components.Tires;
import Vehicle.Car;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;

    @Before
    public void before(){
        customer = new Customer(50000.00);

    }

    @Test
    public void hasMoney(){
        assertEquals(50000.00,customer.getMoney(),0.0);
    }

    @Test
    public void hasCars(){
        assertEquals(0, customer.getNumberOfCars());
    }

    @Test
    public void canBuyCar(){
        Engine engine = new Engine(5.0);
        Tires tires = new Tires("Pirelli", 120.00);
        Car car = new Car ("Lambo",250000.00,"lime green", tires,2, engine);
        customer.buyVehicle(car);
        assertEquals(1,customer.getNumberOfCars());
    }
}
