package players;

import behaviours.IDefend;
import behaviours.IHeal;

public class Cleric extends Player implements IHeal {


    public Cleric(String name, int healthPoints) {
        super(name, healthPoints);
    }

    public void heal(Player player) {
        int heal = player.getHealthPoints() + 5;
        if(heal > player.getMaxHealth()){heal = player.getMaxHealth();}
        player.setHealthPoints(heal);
    }
}
