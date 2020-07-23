package players;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ClericTest {

    private Cleric cleric;
    private Barbarian barbarian;

    @Before
    public void before(){
        cleric = new Cleric("Heilan", 10);
        barbarian = new Barbarian("Barbz", 10);

    }

    @Test
    public void canHealPlayer(){
        barbarian.setHealthPoints(4);
        cleric.heal(barbarian);
        assertEquals(9, barbarian.getHealthPoints());
    }

    @Test
    public void cantHealPlayerOverMax(){
        barbarian.setHealthPoints(4);
        cleric.heal(barbarian);
        cleric.heal(barbarian);

        assertEquals(10, barbarian.getHealthPoints());
    }

}