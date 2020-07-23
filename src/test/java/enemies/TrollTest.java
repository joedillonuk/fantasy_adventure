package enemies;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TrollTest {

    private Troll troll;

    @Before
    public void before(){
        troll = new Troll(20);
    }

    @Test
    public void canGetHealthPoints(){
        assertEquals(20, troll.getHealthPoints());
    }

    @Test
    public void canTakeDamage(){
        troll.takeDamage(1);
        assertEquals(19, troll.getHealthPoints());

    }



}