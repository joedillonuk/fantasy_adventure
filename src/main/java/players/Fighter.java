package players;

import behaviours.IWeapon;
import enemies.Enemy;

public abstract class Fighter extends Player {

    private IWeapon weapon;

    public Fighter(String name, int healthPoints) {
        super(name, healthPoints);
        weapon = null;
    }

    public IWeapon getWeapon() {
        return weapon;
    }

    public void setWeapon(IWeapon newWeapon){
        this.weapon = newWeapon;
    }


    public void attack(Enemy enemy){
        weapon.attack(enemy);
    }


}
