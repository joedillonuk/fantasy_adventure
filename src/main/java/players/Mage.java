package players;

import behaviours.IDefend;
import behaviours.ISpell;

public abstract class Mage extends Player {

    private IDefend defender;
    private ISpell spell;

    public Mage(String name, int healthPoints, IDefend defender) {
        super(name, healthPoints);
        this.defender = defender;
        this.spell = null;
    }

    public IDefend getDefender() {
        return defender;
    }

    public void setDefender(IDefend defender) {
        this.defender = defender;
    }

    public ISpell getSpell() {
        return spell;
    }

    public void setSpell(ISpell spell) {
        this.spell = spell;
    }


}
