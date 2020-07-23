package enemies;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OrcTest {

    Orc orc;

    @Before
    public void before(){
        orc = new Orc(10);
    }

    @Test
    public void canGetHealthPoints(){
        assertEquals(10, orc.getHealthPoints());
    }

    @Test
    public void canTakeDamage(){
        orc.takeDamage(1);
        assertEquals(9, orc.getHealthPoints());

    }

}