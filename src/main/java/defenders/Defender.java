package defenders;

import behaviours.IDefend;
import enemies.Enemy;

public abstract class Defender implements IDefend {

    private int power;

    public Defender(int power) {
        this.power = power;
    }

    public void defend(Enemy enemy) {
        enemy.takeDamage(power);
    }
}
