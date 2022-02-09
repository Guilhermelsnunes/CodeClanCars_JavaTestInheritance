import Components.Battery;
import Components.Engine;
import Components.Tires;
import Vehicle.HybridCar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HybridCarTest {

    HybridCar hybridCar;
    Tires tires;
    Engine engine;
    Battery battery;

    @Before
    public void before(){
        tires = new Tires("Pirelli", 70.00);
        engine = new Engine(1.0);
        battery = new Battery("single");
        hybridCar = new HybridCar("Toyota", 30000.00,"red", tires,4, battery, engine);
    }

    @Test
    public void hasTires(){
        assertEquals("Pirelli", hybridCar.getTires().getBrand());
    }

    @Test
    public void hasEngine(){
        assertEquals(engine, hybridCar.getEngine());
    }

    @Test
    public void hasBattery(){
        assertEquals(battery, hybridCar.getBattery());
    }

    @Test
    public void hasModel(){
        assertEquals("Toyota", hybridCar.getModel());
    }

    @Test
    public void hasPrice(){
        assertEquals(30000.00, hybridCar.getPrice(), 0.0);
    }

    @Test
    public void hasColour(){
        assertEquals("red", hybridCar.getColour());
    }

    @Test
    public void hasDoors(){
        assertEquals(4, hybridCar.getDoors());
    }
}
