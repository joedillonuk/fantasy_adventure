package defenders;

import enemies.Orc;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DragonTest {

    private Dragon dragon;
    private Orc orc;

    @Before
    public void before(){
        dragon = new Dragon(2);
        orc = new Orc(10);
    }

    @Test
    public void canDefend(){
        dragon.defend(orc);
        assertEquals(8, orc.getHealthPoints());
    }



}