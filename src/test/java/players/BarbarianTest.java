package players;

import behaviours.IWeapon;
import enemies.Orc;
import org.junit.Before;
import org.junit.Test;
import weapons.Sword;

import static org.junit.Assert.*;

public class BarbarianTest {

    Barbarian barbarian;
    Orc orc;
    IWeapon weapon;

    @Before
    public void before(){
        barbarian = new Barbarian("Ian", 10);
        weapon = new Sword(5);
        orc = new Orc(10);
    }

    @Test
    public void hasName(){
        assertEquals("Ian", barbarian.getName());
    }

    @Test
    public void weaponStartsNull(){
        assertEquals(null, barbarian.getWeapon());
    }

    @Test
    public void canSetWeapon(){
        barbarian.setWeapon(weapon);
        assertEquals(weapon, barbarian.getWeapon());
    }

    @Test
    public void canAttackEnemy(){
        barbarian.setWeapon(weapon);
        barbarian.attack(orc);
        assertEquals(5, orc.getHealthPoints());

    }

}