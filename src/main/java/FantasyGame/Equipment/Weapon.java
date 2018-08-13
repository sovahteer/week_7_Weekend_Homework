package FantasyGame.Equipment;

import FantasyGame.Behaviours.IWeapon;
import FantasyGame.Enemies.Enemy;

public class Weapon implements IWeapon {
    private WeaponType weaponType;
    private int wearAndTear;

    public Weapon(WeaponType weaponType) {
        this.weaponType = weaponType;
        this.wearAndTear = 0;
    }

    public WeaponType getWeaponType(){
        return this.weaponType;
    }

    public void attack (Enemy enemy){
        enemy.takeDamage(this.weaponType.getDamage() - this.wearAndTear);
        this.wearAndTear--;
    }
}
