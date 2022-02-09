import Components.Tires;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TiresTest {

    Tires tires;

    @Before
    public void before(){
        tires = new Tires("Dunlop", 70.00);
    }

    @Test
    public void hasBrand(){
        assertEquals("Dunlop", tires.getBrand());

    }

    @Test
    public void hasPrice(){
        assertEquals(70.00, tires.getPrice(),0.0);
    }


}
