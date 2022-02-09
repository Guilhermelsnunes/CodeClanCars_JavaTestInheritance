import Components.Battery;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BatteryTest {
    Battery battery;

    @Before
    public void before(){
        battery = new Battery("Dual");
    }

    @Test
    public void hasMotorType(){
        assertEquals("Dual", battery.getMotor());
    }
}
