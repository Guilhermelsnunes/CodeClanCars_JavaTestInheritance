import Components.Engine;
import Components.Tires;
import Vehicle.Car;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarTest {

    Car car;
    Engine engine;
    Tires tires;

    @Before
    public void before(){
        engine = new Engine(5.0);
        tires = new Tires("Pirelli", 120.00);
        car = new Car ("Lambo",250000.00,"lime green", tires,2, engine);
    }

    @Test
    public void hasModel(){
        assertEquals("Lambo", car.getModel());
    }

    @Test
    public void hasPrice(){
        assertEquals(250000.00, car.getPrice(),0.0);
    }

    @Test
    public void hasColour(){
        assertEquals("lime green", car.getColour());
    }

    @Test
    public void hasTires(){
        assertEquals("Pirelli", car.getTires().getBrand());
    }

    @Test
    public void hasDoors(){
        assertEquals(2, car.getDoors());
    }

    @Test
    public void hasEngine(){
        assertEquals(5.0, car.getEngine().getLitre(),0.0);
    }
}
