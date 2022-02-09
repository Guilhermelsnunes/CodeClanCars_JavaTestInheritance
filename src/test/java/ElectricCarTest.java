import Components.Battery;
import Components.Tires;
import Vehicle.ElectricCar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ElectricCarTest {

    ElectricCar electricCar;
    Tires tires;
    Battery battery;

    @Before
    public void before(){
        tires = new Tires("Pirelli", 70.00);
        battery = new Battery("triple");
        electricCar = new ElectricCar("Tesla", 60000.00,"blue", tires,4, battery);
    }

    @Test
    public void hasTires(){
        assertEquals("Pirelli", electricCar.getTires().getBrand());
    }

    @Test
    public void hasBattery(){
        assertEquals(battery, electricCar.getBattery());
    }

    @Test
    public void hasModel(){
        assertEquals("Tesla", electricCar.getModel());
    }

    @Test
    public void hasPrice(){
        assertEquals(60000.00, electricCar.getPrice(), 0.0);
    }

    @Test
    public void hasColour(){
        assertEquals("blue", electricCar.getColour());
    }

    @Test
    public void hasDoors(){
        assertEquals(4, electricCar.getDoors());
    }
}

