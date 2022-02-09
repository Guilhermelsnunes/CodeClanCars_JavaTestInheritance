import Components.Engine;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EngineTest {

    Engine engine;

    @Before
    public void before(){
        engine = new Engine(1.2);
    }

    @Test
    public void hasLitre(){
        assertEquals(1.2, engine.getLitre(),0.0);
    }
}
