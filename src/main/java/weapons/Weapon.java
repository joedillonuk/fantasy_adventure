package weapons;

import behaviours.IWeapon;
import enemies.Enemy;

public abstract class Weapon implements IWeapon {

    private int power;

    public Weapon(int power) {
        this.power = power;
    }

    public void attack(Enemy enemy) {
        enemy.takeDamage(power);
    }
}
