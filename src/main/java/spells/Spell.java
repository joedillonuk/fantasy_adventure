package spells;

import behaviours.ISpell;
import enemies.Enemy;

public abstract class Spell implements ISpell {

    private int power;


    public Spell(int power) {
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public void cast(Enemy enemy) {
        enemy.takeDamage(power);
    }
}
