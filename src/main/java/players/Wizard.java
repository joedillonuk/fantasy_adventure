package players;

import behaviours.IDefend;

public class Wizard extends Mage {
    public Wizard(String name, int healthPoints, IDefend defender) {
        super(name, healthPoints, defender);
    }
}
